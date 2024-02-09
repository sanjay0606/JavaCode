package Interfaces;

public class NiceCar {
    private Engine engine;
    public NiceCar(){
        this.engine=new PoweredEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        this.engine.start();
    }
    public void stop(){
        this.engine.stop();
    }

}
