import java.util.Scanner;
public class task_1_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean isPrime;
        int count = 0;
        
        if(end<start){
            int a = start;
            start = end;
            end = a;
        }
        for (int i = start; i <= end; i++) {
            if(i<2){
                continue;
            }
            isPrime = true;
            for(int j = 2; j <= i; j++) {
                if(i % j == 0 && j != i) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime ) {
                count++;
            }
        }
        System.err.println("There are "+ count +" prime numbers between "+start+" and "+end+".");
        sc.close();
    }
}