package SubSet;

import java.util.Arrays;

public class Question79 {
    public static void main(String[] args) {

       char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//       boolean[][] arr={{true,true,true,true},{true,true,true,true},{true,true,true,true}};
       boolean[] x={false};
        String word = "EES";
        for(int k=0;k<board.length;k++){
            for(int j=0;j<board[0].length;j++){
                boolean[][] arr={{true,true,true,true},{true,true,true,true},{true,true,true,true}};
                check("",word,board,arr,k,j,0,x,"");

            }
            System.out.println();
        }
//


        System.out.print(x[0]);


    }
    public static void check(String str,String word,char[][] board,boolean[][] arr,int row,int col,int i,boolean[] x,String path){
        if (i < word.length()) {
            char ch=word.charAt(i);
            if(!arr[row][col]){
                return;
            }
            arr[row][col]=false;
            if(board[row][col]!=ch){
                arr[row][col]=true;
                str="";
                i=0;

                return;




            }
            else{
                str=str+ch;

                i=i+1;

            }
            if(str.equals(word)){
                x[0]=true;
                System.out.println(str);
                System.out.println(path);
                for(int k=0;k<arr.length;k++){
                    for(int j=0;j<arr[0].length;j++){
                        System.out.print(arr[k][j]+" ");

                    }
                    System.out.println();
                }
                return;
            }
            if(row>0){
                check(str,word,board,arr,row-1,col,i,x,path+"U");
            }
            if(col>0){
                check(str,word,board,arr,row,col-1,i,x,path+"L");
            }
            if(row<board.length-1){
                check(str,word,board,arr,row+1,col,i,x,path+"D");
            }
            if(col<board[0].length-1){
                check(str,word,board,arr,row,col+1,i,x,path+"R");
            }
            arr[row][col]=true;

        }


    }

}
