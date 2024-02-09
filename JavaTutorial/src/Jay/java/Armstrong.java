package Jay.java;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        System.out.println(num==checkArm(num));
        for(int i=100;i<=999;i++){
            if(i==checkArm(i)){
                System.out.println(i);
            }
        }



    }

    static int checkArm(int num){
        if(num/10==0){
            return num*num*num;
        }
        int digit=num%10;
        return (digit*digit*digit) + checkArm(num/10);
    }
}
