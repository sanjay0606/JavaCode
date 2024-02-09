package Jay.java;

import java.util.Arrays;

public class TwoStacks {
    public static void main(String[] args) {
        int[] first={4,2,4,6,1};
        int[] second={2,1,8,5};

        System.out.print(count(first,second,0,0,10)-1);


    }

    public static int count(int[] a,int[] b,int sum,int count,int x){


        if(sum>x){
            return count;


        }

        if(a.length==0 || b.length==0){
            return count;
        }
        int left=count(Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1,x);

        int right=count(a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1,x);

        return Math.max(left,right);

    }
}
