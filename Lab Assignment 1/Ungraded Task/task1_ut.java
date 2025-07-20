import java.util.Scanner;
public class task1_ut {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int size = sc.nextInt();
        int [] arr =  new int[size];
        for(int i = 0 ; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Remove Element = ");
        int remove = sc.nextInt();
        boolean flag = false;
        System.out.println("Input array:");
        for(int i = 0; i < size; i++){
            if(arr[i] == remove){
                flag = true;
            }
            System.out.print(arr[i] + " ");
        }
        if(flag == true){
            System.out.println("\nNew array:");
            for(int i = 0; i < size; i++){
                if(arr[i] != remove){
                    System.out.print(arr[i] + " ");
                }
            }
        }
        else{
            System.out.println("\nElement not found");
        }
        sc.close();
    }
}