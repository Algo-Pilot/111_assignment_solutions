import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner sc =  new Scanner (System.in);
        int sum = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            if(a % 2 ==1 && a > 0){
                sum += a;
                count++;
                if(a< min){
                    min = a;
                }
                if(a> max){
                    max =a;
                }
            }
            
        }
        if(sum !=0){
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            double avg = sum / (double)count;
            System.out.println("Average = " + avg);
        }
        else{
            System.out.println("No odd positive numbers found");
        }
        
        sc.close();
    }
}
