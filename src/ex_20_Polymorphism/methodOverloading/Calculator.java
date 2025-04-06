package ex_20_Polymorphism.methodOverloading;

public class Calculator {

    int attribute;

    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }


public static void main(String [] args) {


    Calculator c1 = new Calculator();
    int add1 = c1.add(6,8);
    double add2 = c1.add(8.91, 8891.1);
    System.out.println(add2);
    System.out.println(add1);
}
}