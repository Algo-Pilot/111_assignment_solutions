import java.util.Arrays;
import java.util.Scanner;
public class task_3_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int [] array =  new int [length];
        for(int i = 1; i <= length; i++){
            array[length - i] = sc.nextInt();
        }
        for(int i = 0; i < length; i++){
            if (i == length -1){
                System.out.println(array[i]);
            }
            else{
                System.out.print(array[i] + " ");
            }
            
        }
    }
}
    