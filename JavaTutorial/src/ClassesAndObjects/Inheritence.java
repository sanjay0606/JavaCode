package ClassesAndObjects;

import java.lang.reflect.Constructor;

public class Inheritence {
    public static void main(String[] args) {
//        Box  s2=new Box(1,4);
//        System.out.println(SBox.x);
        Box  s1=new SBox();

        PBox p1=new PBox();
        System.out.println(Box.x);
//        s1.convert();
//        System.out.print(s1.length+"  "+s1.width+"  "+s1.height);
        System.out.print(Box.x);
        s1.displays();


    }
}

class Box{
    int length;
    int width;
    static int x=5;

    Box(){
        System.out.println("Box Const");
        this.length=-1;
        this.width=-1;
    }
    Box(int length,int width){
        this.length=length;
        this.width=width;
    }

     void displays(){
        System.out.print("hello Box");
    }



}

class SBox extends Box{
    int height;

    SBox(){
        super();
        System.out.println("sbox const");

        this.height=-1;



    }
     void convert(){
        SBox.x=8;
    }
    SBox(int length,int width,int height){
        super(length,width);
        this.height=height;


    }
    void displays(){
        System.out.print("hello SBox");
    }


}

class PBox extends SBox{
        int cost;

        PBox(){
            super();
            this.cost=-1;

        }

        }

