package Interfaces;

public class Main {
    public static void main(String[] args) {
       Car car=new Car();
       PoweredEngine e1=new PoweredEngine();
       ElectricEngine e2=new ElectricEngine();
       NiceCar n1=new NiceCar(e1);
       
        NiceCar n2=new NiceCar(e2);

       n1.start();
        n2.start();


//        car.acc();
//        car.start();
//        car.stop();
//        car.c;
    }
}
