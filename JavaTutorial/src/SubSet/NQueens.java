package SubSet;

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
           int count= queens(board,0);
           System.out.println(count);
    }
    static int queens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count=count+queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //for vertical
        for(int i=0;i<row;i++){
            if(board[i][col]==true){
                return false;
            }
        }
        //for left-diagonal

        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]==true){
                return false;
            }
        }

        //for right-diagonal

        int maxright=Math.min(row, board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]==true){
                return false;
            }
        }

        return true;
    }


    static void display(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==true){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
