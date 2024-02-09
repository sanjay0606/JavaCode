package ClassesAndObjects;

public class InnerClass {
      static class Test{
        static int  roll;
        int x =4;

        static void help(){
            System.out.print("bdbh");
        }
        Test(int roll){
            Test.roll=roll;
        }
    }

    public  static void main(String[] args) {
        Test obj=new Test(4);
        System.out.println(obj.roll);
        Test obj1=new Test(7);
       System.out.println(obj.roll);
        Test.help();
       int num= Test.roll;
    }
}
