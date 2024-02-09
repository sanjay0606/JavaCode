package SubSet;

public class Question494 {

    public static void main(String[] args) {
        int arr[]={1,0,0};

        int target=1;
        int i=0;
        int sum=0;


    }
    public static int countways(int sum,int target,int[] arr,int i){
//        System.out.println(sum);

//        if(sum<0){
//            sum=0;
//        }
        if(sum==target && i==arr.length){
            System.out.println(target);


            return 1;

        }

        if(i==arr.length){
            return 0;
        }

        int count=0;
        int leftsum=sum+arr[i];
//        System.out.println(leftsum);
        int rightsum=sum-arr[i];
//        System.out.println(rightsum);
        int left=countways(leftsum,target,arr,i+1);
       int right= countways(rightsum,target,arr,i+1);

        count=left+right;
        return count;



    }
}

