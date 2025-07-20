
// //with haset
// // Write a program that counts the number of occurrences of each integer in an array.
// import java.util.Iterator;
// import java.util.HashSet;
// import java.util.Scanner;
// public class task_4_int_counter {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("N = ");
//         int length = sc.nextInt();
//         int [] array =  new int [length];
//         HashSet<Integer> uniq_val = new HashSet<Integer>();
//         for(int i = 0; i < length; i++){
//             array[i] = sc.nextInt();
//             uniq_val.add(array[i]);
//         }
//         Iterator it = uniq_val.iterator();
//         while (it.hasNext()){
//             int count = 0;
//             int a = (int) it.next();
//             for(int j = 0; j < length; j++){
//                 int b = array[j];
//                 if(b== a){
//                     count++;
//                 }
//             }
//             System.out.println(a +" - "+ count+" times");
//         }
        
//     }
// }

// with hashmap



//without hashmap && //without hashset
import java.util.Scanner;
public class task_4_int_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int[] num = new int[N];
        boolean[] repeat_check = new boolean[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        int count;
        for (int i = 0; i < N; i++) {
            if (!repeat_check[i]) {
                count = 1;
                for (int j = i + 1; j < N; j++) {
                    if (num[i] == num[j]) {
                        count++;
                        repeat_check[j] = true;
                    }
                }
                System.out.println(num[i] + " - " + count + " times");
            }
        }
        sc.close();
    }
}
