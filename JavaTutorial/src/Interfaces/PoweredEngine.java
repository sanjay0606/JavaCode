package Interfaces;

public class PoweredEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Powered engine starts");
    }

    @Override
    public void stop() {
        System.out.print("Powered engine stops");

    }

    @Override
    public void acc() {
        System.out.print("Powered engine accelerate");

    }
}
