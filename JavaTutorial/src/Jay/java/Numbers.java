package Jay.java;

public class Numbers {
    public static void main(String[] args) {
        int arr[]={1,2,1,1,2,2,5};
        int n=6;
        int ans=1;
        int base=3;
        while(n>0){
            if((n&1)==1){
                ans=ans*base;
            }
            base=base*base;
            n=n>>1;
        }
//        while(n>0){
//            int last=n & 1;
//            n=n>>1;
//
//            ans=ans +(base * last);
//            base=5*base;
//
//        }


        System.out.println(ans);



//        System.out.println(uniqueNum(arr));


    }
//    public static int uniqueNum(int [] arr){
//        int xor=0;
//        for (int i=0;i<arr.length;i++){
//            xor=xor ^ arr[i];
//
//
//        }
//        return xor;
//    }



}
