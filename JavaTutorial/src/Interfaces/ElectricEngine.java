package Interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Elecrtic engine starts");
    }

    @Override
    public void stop() {
        System.out.print("Elecrtic engine stopss");

    }

    @Override
    public void acc() {
        System.out.print("Elecrtic engine accelerate");

    }
}
