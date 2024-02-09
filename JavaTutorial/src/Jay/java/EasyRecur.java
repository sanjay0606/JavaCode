package Jay.java;

public class EasyRecur {
    public static void main(String[] args) {
//        fun(5);
        int sum=0;
//        reverse(1824,sum);
        int count=0;
        System.out.println(count(32004,count));
        System.out.println(count);



    }
    static void fun(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        System.out.println(n);
        fun(--n);




    }
    static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(n-1);
    }
    static int sumOfDigits(int n){
        if(n<=0){
            return 1;
        }
        int num=n%10;
        int next=n/10;
        return num* sumOfDigits(next);
    }
    static void reverse(int n,int sum){

        if(n==0){
            return;
        }
        int eem=n%10;

        sum=sum*10 +eem;
        fun(n/10);
        System.out.print(sum);

    }
    static int count(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            return count(n/10,count+1);
        }

        return count(n/10,count);
    }
}
