import java.util.Scanner;
public class task3_cw {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.println("Please enter the elements of the array:");
        double [] arr = new double[n];
        int removed = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            double a = sc.nextDouble();
            for(int j = 0; j < i;j++){
                if(arr[j] == a){
                    removed++;
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[i] = a;
            }
        }
        System.out.print("New Array:");
        for(int i = 0;i < n; i++){
            if(arr[i] != 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Removed elements : "+removed);
        sc.close();
    }
}
