package ClassesAndObjects;

import java.util.Arrays;

public class Classes {
    public static void main(String[] args) {
        String a="aman";
        String b="sanjay";
        double num=-33.456; //33456
        double num2=-33.45609; //33456.09
        System.out.print((long)(num*1000)==(long)(num2*1000));


//        String str=String.valueOf(num);
//        String[] arr=str.split(".");
//        System.out.println(arr[0]);
//        System.out.print((""+num));

        swap(a,b);
//        System.out.print(a);
//        final int x=5;
//        x=10;

        Student s1=new Student(8 );



//        final Student s2=new Student();
//        s2.name="bcjcb";

//        System.out.print(s1.name);

    }

     static void swap(String a,String b){
        String temp=a;
        a=b;
        b=temp;
     }
}

class Student{

     String name;
    int roll;

    Student(){
        this.name="chamna";
    }
    Student(int roll){
       this.roll=roll;


    }
   void message(){
        System.out.println(this.roll);
    }

    @Override
    protected void finalize() throws Throwable {
       System.out.println(this.roll +"  object is destroyed");
    }
}
