package ex_24_OOPs_Abstraction;

public class Lab159_Abstraction_Real_ex3 {
    public static void main(String[] args) {

        c1 c = new c1();
        c.computePay();

    }
}

abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }


}


class c1 extends Employee{

    @Override
    double computePay() {
        System.out.println("completed the Abstract class");
        return 1000;

    }
}
