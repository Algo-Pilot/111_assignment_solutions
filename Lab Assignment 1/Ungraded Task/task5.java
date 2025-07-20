import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int row = sc.nextInt();
        System.out.print("N = ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for( int j =0; j< col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix A");
        for(int i = 0; i < row; i++){
            for(int j =0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transpose A");
        for(int i =0; i < row; i++){
            for(int j =0; j< col; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}