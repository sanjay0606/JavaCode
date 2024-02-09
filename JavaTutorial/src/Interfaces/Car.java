package Interfaces;

public class Car implements Engine,Brake{

//    int c=0;
    @Override
    public void brake() {
                System.out.println("i will brake like normal");
    }

    @Override
    public void start() {
        System.out.println("i will start like normal");

    }

    @Override
    public void stop() {
        System.out.println("i will stop like normal");

    }

    @Override
    public void acc() {
        System.out.println("i will accelerate like normal");

    }
}
