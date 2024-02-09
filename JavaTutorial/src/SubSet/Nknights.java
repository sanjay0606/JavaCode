package SubSet;

public class Nknights {
    public static void main(String[] args) {

        int n=4;
        boolean[][] board=new boolean[n][n];
        knight(board,0,0,n);

    }

    static void knight(boolean[][] board,int row,int col,int knights){
         if(knights==0){
             display(board);
             System.out.println();
             return;

         }
         if(row== board.length-1 && col== board.length-1){
             return;
         }
        if(col==board.length){
            knight(board,row+1,0,knights);
            return;
        }
         if(isSafe(board,row,col)){
             board[row][col]=true;
             knight(board,row,col+1,knights-1);
             board[row][col]=false;

         }


         knight(board,row,col+1,knights);

    }
    static boolean isSafe(boolean[][] board,int row,int col){

        if(validif(row-1,col-2,board)){
            if(board[row-1][col-2]==true){
                return false;
            }

        }
        if(validif(row-1,col+2,board)){
            if(board[row-1][col+2]==true){
                return false;
            }

        }
        if(validif(row-2,col-1,board)){
            if(board[row-2][col-1]==true){
                return false;
            }

        }
        if(validif(row-2,col+1,board)){
            if(board[row-2][col+1]==true){
                return false;
            }

        }
        return true;
    }
    static boolean validif(int row,int col,boolean[][] board){
        if(row >=0 && row<board.length && col >=0 && col<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==true){
                    System.out.print("K");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
