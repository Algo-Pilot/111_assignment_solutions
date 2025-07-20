import java.util.Scanner;
public class task4_ut {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       int [][] A = {{4, 5, 7},
                     {0, 3, -2},
                     {4, 1, -4},
                     {5, 10, 1}};
        int k = sc.nextInt();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                int a = A[i][j];
                a = a * k;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}