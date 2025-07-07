import java.util.Scanner;
public class task_5_treasure_hunt_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = {{0,0,10,0,-1},
                         {0,-1,0,0,-1},
                         {-1,0,-1,0,0},
                         {0,-1,7,0,-1},
                         {0,-1,0,-1,0}};
        System.out.println("Initial Map:");
        printMap(arr2D);
        int row = arr2D.length;
        int col = arr2D[0].length;
        int row_pos = -1, col_pos = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr2D[i][j] == 7) {
                    row_pos = i;
                    col_pos = j;
                    break;
                }
            }
        }
        int total_moves = 5;
        while (total_moves > 0) {
            int nr = row_pos, nc = col_pos;
            System.out.printf("Enter move %d: ", (6 - total_moves));
            String move = sc.nextLine().toUpperCase();
            switch (move) {
                case "UP":
                    nr--;
                    break;
                case "DOWN":
                    nr++;
                    break;
                case "LEFT":
                    nc--;
                    break;
                case "RIGHT":
                    nc++;
                    break;
                default:
                    System.out.println("Invalid input! Use UP, DOWN, LEFT or RIGHT.");
                    continue;
            }
            if (nr < 0 || nr >= row || nc < 0 || nc >= col) {
                System.out.println("Player fell outside the playing area. Game over!");
                return;
            }
            int index = arr2D[nr][nc];
            if (index == -1) {
                arr2D[row_pos][col_pos] = 0;
                arr2D[nr][nc] = 7;
                System.out.println("Current state:");
                printMap(arr2D);
                System.out.println("Player stepped on mine. Game Over!");
                return;
            }
            else if (index == 10) {
                arr2D[row_pos][col_pos] = 0;
                arr2D[nr][nc] = 7;
                System.out.println("Current state:");
                printMap(arr2D);
                System.out.println("Treasure found. You win!");
                System.out.println("Final state:");
                printMap(arr2D);
                return;
            }
            else {
                arr2D[row_pos][col_pos] = 0;
                arr2D[nr][nc] = 7;
                row_pos = nr;
                col_pos = nc;
            }
            System.out.println("Current state:");
            printMap(arr2D);
            total_moves--;
        }
        if (total_moves == 0) {
            System.out.println("Failed to find the treasure.");
        }
    }
    public static void printMap(int[][] arr) {
        for (int[] row: arr) {
            for (int value: row) {
                System.out.printf("%3d", value);
            }
            System.out.println();
        }
    }
}