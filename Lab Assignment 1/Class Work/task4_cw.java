import java.util.Scanner;
public class task4_cw {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();
        System.out.print("column = ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0; i < row;i++){
            for(int j =0; j< col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("1D Array:");
        for(int i = 0; i<row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
        sc.close();
    }
}
