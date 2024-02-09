package Jay.java;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
        int []array={4,3,2,1 };
        bubble(array,0, array.length-1 );
        System.out.print(Arrays.toString(array));
//        triangle(4,0);

    }
    static void triangle(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            triangle(row,col+1);
            System.out.print("x" + " ");


        }
        else{

            triangle(row-1,0);
            System.out.println();

        }

    }
    static void bubble(int[] arr,int s,int t){
        if(t==0){
            return;
        }
        if(s<t){
            if(arr[s]>arr[s+1]){
                int temp=arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
            }
            bubble(arr,s+1,t);

        }
        else{
            bubble(arr,0,t-1);
        }
    }

}
