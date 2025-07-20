public class task5 {
    public static void main(String [] args){
        int [][] A = {{1, 0, 0},
                      {0, 1, 0},
                      {0, 0, 1}};
        int row = A[1].length;
        int col = A.length;
        boolean [][] vis = new boolean[col][row];
        for(int i = 0; i < col; i++){
            vis[i][i] = true;
        }
        boolean capture = true;
        for(int i =0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(A[i][j] == 1 && vis[i][j] == false){
                    capture = false;
                    break;
                }
            }
            if(capture == false){
                break;
            }
        }
        if(capture == true){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not an Identity Matrix");
        }
    }
}
