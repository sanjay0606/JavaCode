package linerSearch;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println("" + new Integer(55) + new ArrayList<>());
//
//        int[] arr={5,4,3,2,1};
//
//        String a="a";
//        String  b="a";
//        String name=new String("sanjay");
//        String name2=name;
//
//        System.out.println(name==name2);
//        System.out.println(name);
//        a="c";
//        int[] arr1=arr;
//
//        int y=1;
//        int x=y;
//        y=2;
//        System.out.println(x==y);
//
//
//        int n=arr.length;
//        int i=0;
//        while(i<n){
//            int correct=arr[i]-1;
//            if(arr[i]!=arr[correct]){
//                int tem=arr[correct];
//                arr[correct]=arr[i];
//                arr[i]=tem;
//            }
//            else{
//                i++;
//            }
//
//        }
//        System.out.println(b);
//        arr[0]=6;
//        System.out.println(arr1==arr);
//        System.out.print(Arrays.toString(arr));
        int n=4;
//        for(int row=1;row<2*n;row++){
//            int c=76551;
//            int spaces=5;
//            if(row<n){
//                c=row;
//                spaces=n-row;
//            }
//            else{
//                c=2*n-row;
//                spaces=row-n;
//            }
//
//            for(int k=1;k<=spaces;k++){
//                System.out.print(" ");
//            }
//
//            for(int col=1;col<=c;col++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//
////
//        }
//        for(int row=1;row<=n;row++){
//            for(int spaces=1;spaces<=n-row;spaces++){
//                System.out.print(" ");
//            }
//
//            for(int col=row;col>=1;col--){
//                System.out.print(col +" ");
//            }
//            for(int col=2;col<=row;col++){
//                System.out.print(col +" ");
//            }
//            System.out.println(" ");
//        }
//        for(int row=1;row<2*n;row++){
//            for(int col=1;col<2*n;col++){
//                int num=n-(Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col)));
//                System.out.print(num+1 +" ");
//            }
//            System.out.println();
//        }
        int [] arr={1,2,3,4,5};



//

        String a="sanjay";
        String b=a;
        b="karan";
        System.out.println(fib(7));
        System.out.println(binary(2,0,4,arr));



    }
    public static int fib(int n){
        if(n<=0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static int binary(int n,int start,int end,int[] arr){
            if(start<=end){

                int mid=start +(end-start)/2;
                if(arr[mid]==n){
                    return mid;
                }
                else if(n<arr[mid]){
                    return binary(n,start,mid-1,arr);
                }
                else if(n>arr[mid]){
                    return binary(n,mid+1,end,arr);
                }

            }



            return -1;




    }
}
