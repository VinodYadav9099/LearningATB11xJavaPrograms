package ex_19_OOPs_Inheritance.Multi_Level_Inheritance;

public class Lab145_MultiLevel1 {

    public static void main(String[] args) {
        GrandFather gf1 = new GrandFather();
        gf1.gf();
        System.out.println("====================");
        Father f1= new Father();
        f1.gf();
        f1.F();
        System.out.println("====================");
        Son s1 = new Son();
        s1.gf();
        s1.F();
        s1.s();
    }
}
