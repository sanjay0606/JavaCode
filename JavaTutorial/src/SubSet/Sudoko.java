package SubSet;

public class Sudoko {
    public static void main(String[] args) {
        int[][] board=new int[][]{
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };
        if(solver(board)){
            display(board);
        }
        else{
            System.out.println("nhi hoga mujhsee");
        }

    }

    static boolean solver(int[][] board){
        int row=-1;
        int col=-1;

        boolean isempty=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    isempty=true;
                    break;

                }
            }
            if(isempty==true){
                break;
            }
        }
        if(isempty==false){
            return true;
        }
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(solver(board)){

                    return true;
                }
                else{
                    board[row][col]=0;
                }
            }
        }
        return false;
    }

    static void display(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ "  " );
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(int[][] board,int row,int col,int num){

        //complete row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        //for complete col
        for(int i=0;i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }

        //for square box;

        int sqrt=(int)(Math.sqrt(board.length));
        int startRow=row-row%sqrt;
        int startCol=col-col%sqrt;
        for(int i=startRow;i<startRow+sqrt;i++){
            for(int j=startCol;j<startCol+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }


        return true;

    }
}
