package Jay.java;

public class Prime {
    public static void main(String[] args) {
        int num=36;

//        boolean[] arr=new boolean[num+1];
//        for(int i=2;i*i<=num;i++){
//            if(arr[i]==false){
//                for(int j=i*2;j<=num;j=j+i){
//                    arr[j]=true;
//                }
//            }
//        }
//        for(int i=2;i<=num;i++){
//            if(arr[i]==false){
//                System.out.print(i+ " ");
//            }
//        }
        System.out.println(sqr(40));
    }
    public static double sqr(int n){
        int start=2;
        int end=n;
        double root=0.0;
        while(end>=start){
            int mid=start +(end-start)/2;



            if(mid*mid==n){

                return mid;
            }
            else if(mid*mid>n){
                end=mid-1;
            }else if(mid*mid <n){
                start=mid+1;
            }
        }
        double incr=0.1;

        for(int i=0;i<3;i++){
            System.out.println(root+"-");

            while(root*root<=n){
                root=root+incr;
                System.out.println(root);
            }
            root=root-incr;
            incr=incr/10;
        }

        return root;
    }

}
