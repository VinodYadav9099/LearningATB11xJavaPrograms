package ex_27_Static;

public class Lab169_Static_ex3 {

    public static void main(String[] args) {
        B.commonToAll();
        B b1 = new B();
        b1.display();
    }
}



class B{

    static{

        System.out.println("SIB, called once, class is loaded");
    }

    int a = 10;
    static int b =10;

    void display(){
        System.out.println(b);
        System.out.println("Non Static F(n)");
    }

    static void commonToAll(){
//        System.out.println(a);
        System.out.println("Static F(n)");
    }
}
