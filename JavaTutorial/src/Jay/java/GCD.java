package Jay.java;

public class GCD {
    public static void main(String[] args) {

        System.out.println(gcd(18,9));
        System.out.print(lcm(2,7));

    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }

        return gcd(b%a,a);
    }
    static int lcm(int a,int b){
        int hcf=gcd(a,b);

        return a*b/gcd(a,b);
    }
}
