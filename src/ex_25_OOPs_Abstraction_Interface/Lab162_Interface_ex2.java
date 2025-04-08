package ex_25_OOPs_Abstraction_Interface;

public class Lab162_Interface_ex2 {

    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.display();
    }
}




class Car1 implements Engine,breaks{


    void display(){
        startEngine();
        stopEngine();
        test();
        applyBreak();
    }

    @Override
    public void startEngine() {

        System.out.println("Start Engine");

    }

    @Override
    public void stopEngine() {

        System.out.println("Stop Engine");

    }

    @Override
    public void test() {
        Engine.super.test();
    }

    @Override
    public void applyBreak() {

        System.out.println("Apply Breaks");

    }
}







interface breaks{
    void applyBreak();
}


interface Engine{

    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("This is a Concrete method");

    }
    static void test1(){
        System.out.println("This is the concrete Method");

    }

}
