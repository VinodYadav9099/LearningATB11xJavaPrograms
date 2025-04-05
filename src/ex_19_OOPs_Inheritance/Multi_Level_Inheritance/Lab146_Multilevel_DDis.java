package ex_19_OOPs_Inheritance.Multi_Level_Inheritance;

public class Lab146_Multilevel_DDis {

    public static void main(String[] args) {

        GrandFather gf2 = new Father();
        gf2.gf();
        gf2.home();

        GrandFather gf3 = new Son();
        gf3.home();
        System.out.println("========================");

        Father f2 = new Son();
        f2.home();


    }
}
