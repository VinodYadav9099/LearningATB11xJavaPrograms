package ex_23_OOPs_Super;

public class Lab155_Super1 {
    public static void main(String[] args) {
            Car c1 = new Car();
            c1.display();
    }
}

class Vehicle{

    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("Default Constructor");

    }

    Vehicle(int a){
        System.out.println("PC- Constructor");
    }


    // Method Overloading - Same, same name function with different arguments.
    void Engine(){

        System.out.println("No Return and No Argument");

    }

    void Engine(int capacity){
        System.out.println("No Return with parameters");
    }

    void display(){
        System.out.println("Vehicle Parent");
    }

}

class Car extends Vehicle{

    private int maxSpeed = 250;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    Car(){
     super();
        System.out.println("Above line is accessing the Parent constructor that is Default");
    }

    Car(int a){
        super(10);
    }

    //Method Overriding

    @Override
    void display(){

        System.out.println(this.maxSpeed);

        System.out.println(super.maxSpeed);

        super.Engine();
        super.Engine(100);

        super.display();


    }
}
