package ex_25_OOPs_Abstraction_Interface;

public class Lab161_Interface_ex1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.Area(10,10);
    }
}



class Rectangle implements polygon{
    @Override
    public void Area(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}








interface polygon{

    void Area(int length, int breadth);
}
