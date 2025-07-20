import java.util.Scanner;
public class task2 {
    public static void main(String [] args){
        Scanner sc=  new Scanner(System.in);
        int [] arr =  new int[5];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_index = 0, min_index = 0;
        for(int i = 0; i < 5; i++){
            int a = sc.nextInt();
            arr[i] = a;
            if(a > max){
                max = a;
                max_index = i;
            }
            if(a < min){
                min = a;
                min_index = i;
            }
        }
        System.out.printf("The largest number %d was found at location %d.%n", max, max_index);
        System.out.printf("The smallest number %d was found at location %d.%n", min , min_index);
        sc.close();
    }
}
