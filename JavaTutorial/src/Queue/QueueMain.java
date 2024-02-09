package Queue;

import java.util.Arrays;

public class QueueMain {

    public static void main(String[] args) throws Exception{
        CircularQueue que=new CircularQueue(5);


        que.insert(1);
        que.insert(2);
        que.insert(3);
        que.insert(4);
        que.insert(5);
        que.display();
        que.remove();
        que.insert(122);




        que.display();

        int[] arr={3,10,16,4,15,17};
        for(int i=0;i<arr.length;i++){
            int count=0;
            int val=arr[i];
            while(val!=1){
                val= val >> 1;
                count++;
            }
            arr[i]=Math.min(arr[i]-(int)Math.pow(2,count),(int)Math.pow(2,count+1)-arr[i]);
        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(count(49,1));
//        int count=1;
//
//        for(int i=0;i<15;i++){
//            if(i%2==0){
//                count=count*5;
//            }
//            else{
//                count=count*4;
//            }
//        }
//        System.out.println(count%1000000007);
//        System.out.println(Math.floorMod(count,10000007));
//        Math.ceilMod(count,10000000);


    }
//    public static double count(long n,double count){
//
//        double res=count;
//        if(n<=0){
//            res=res*5;
//            return (double)res%(Math.pow(10,9)+7);
//        }
//
//        if(n%2==0 && n!=0){
//            res=res*5;
//        }
//        else if(n%2!=0){
//            res=res*4;
//        }
//
//
//
//
//        return count(n-1,res);
//
//
//    }






}
