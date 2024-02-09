package SubSet;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathDiagonal("",3,3));
//        System.out.println(obstacount(0,0));
        boolean[][] board={{true,true,true},{true,true,true},{true,true,true}};
        int[][]path=new int[board.length][board[0].length];
//        obstacountmaze("",board,0,0);
//        allPath("",board,0,0);

        pallPath("",board,0,0,1,path);
//        printpath(board,path,0,0,1,"");




    }
    static int count (int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);

        return  left+right;
    }
    static ArrayList<String> path(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> str=new ArrayList<>();

            str.add(p);
            return str;
        }
        ArrayList<String> list=new ArrayList<>();
       
        if(r>1){
           list.addAll(path(p+'D',r-1,c));
        }
        if(c>1){
           list.addAll(path(p+"R",r,c-1));
        }
        return list;

    }
    static ArrayList<String> pathDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> str=new ArrayList<>();

            str.add(p);
            return str;
        }
        ArrayList<String> list=new ArrayList<>();

        if(r>1){
            list.addAll(pathDiagonal(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathDiagonal(p+"R",r,c-1));
        }
        if(r>1 && c>1){
            list.addAll(pathDiagonal(p+"Dia",r-1,c-1));
        }
        return list;

    }
    static int obstacount(int r,int c){
        if(r==1 && c==1){
            return 0;

        }
        if(r==2 || c==2){
            return 1;
        }

        int left = obstacount(r+1,c);
        int right=obstacount(r,c+1);

        return left+right;
    }
    static void obstacountmaze(String p, boolean [][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;

        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            obstacountmaze(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            obstacountmaze(p+"R",maze,r,c+1);
        }




    }

    static void allPath(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.print(p + "   ");
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            allPath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPath(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPath(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;


    }

//    static void printpath(boolean[][]maze,int [][]path,int r,int c,int step,String p){
//        if(r==maze.length-1 && c==maze[0].length-1){
//            path[r][c]=step;
//            System.out.print(p + "   ");
//            System.out.println();
//            for(int i=0;i<maze.length;i++){
//                System.out.println(Arrays.toString(path[i]));
//            }
//            System.out.println();
//            return;
//        }
//
//        if(maze[r][c]=false){
//            return;
//        }
//        maze[r][c]=false;
//        path[r][c]=step;
//
//        if(r< maze.length-1){
//            printpath(maze,path,r+1,c,step+1,p+"D");
//        }
//        if(c<maze[0].length-1){
//            printpath(maze,path,r,c+1,step+1,p+"R");
//        }
//        if(r>0){
//            printpath(maze,path,r-1,c,step+1,p+"U");
//        }
//        if(c>0){
//            printpath(maze,path,r,c-1,step+1,p+"L");
//        }
//        maze[r][c]=true;
//        path[r][c]=0;
//    }

    static void pallPath(String p,boolean[][] maze,int r,int c ,int step,int[][] path){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            System.out.print(p + "   ");
            System.out.println();
            for(int i=0;i<maze.length;i++){
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println();
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r< maze.length-1){
            pallPath(p+"D",maze,r+1,c,step+1,path);
        }
        if(c<maze[0].length-1){
            pallPath(p+"R",maze,r,c+1,step+1,path);
        }
        if(r>0){
            pallPath(p+"U",maze,r-1,c,step+1,path);
        }
        if(c>0){
            pallPath(p+"L",maze,r,c-1,step+1,path);
        }
        maze[r][c]=true;
        path[r][c]=0;


    }
}
