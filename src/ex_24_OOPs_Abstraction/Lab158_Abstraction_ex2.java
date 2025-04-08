package ex_24_OOPs_Abstraction;

public class Lab158_Abstraction_ex2 {
    public static void main(String[] args) {

        Benz b1 = new Benz();
        b1.startEngine();
        b1.stopEngine();
        b1.normal();//extended or inherited by the parent class Car
    }


}

abstract class Car{

    abstract void startEngine();
    abstract void stopEngine();
    void normal(){
        System.out.println("This is a normal method");
    }
}

class Benz extends Car{


    @Override
    void startEngine() {
        System.out.println("Starting the Engine");
    }

    @Override
    void stopEngine() {

        System.out.println("Stopping the Engine");

    }
}
