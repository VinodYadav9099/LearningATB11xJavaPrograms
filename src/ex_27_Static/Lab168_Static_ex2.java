package ex_27_Static;

public class Lab168_Static_ex2 {

    public static void main(String[] args) {

        A ref1 = new A(10);
        ref1.display();
        //A.show();
        A.b =45;
        System.out.println(A.b);
        A.show();
       // System.out.println();


        System.out.println("--------------");

        A ref2 = new A(20);
        ref2.display();
        System.out.println(A.b);
        A.show();

        System.out.println("----------------");

        A ref3 = new A(20);
        ref3.display();
        System.out.println(A.b);


    }
}




class A {



    int a;
    static int b= 20;


    A(int a){
        this.a= a;
    }

    void display()
    {
        System.out.println(this.a);
    }

    static void show(){
        System.out.println("Static Method");
    }

}