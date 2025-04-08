package ex_01_Java_Basic;

public class check {
    public static void main(String[] args) {

        String str1= "Hello";
        str1 = str1 + " World";
        System.out.println(str1);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("   World");
        //sb.delete(6,10);
        System.out.println(sb);

        Calculator c1 = new Calculator();
        int a1 = c1.add(10,20);
        System.out.println(a1);






    }
}

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}
