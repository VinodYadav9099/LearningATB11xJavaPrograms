package ex_19_OOPs_Inheritance.Multi_Level_Inheritance;

public class Lab147_Multilevel2 {

    public static void main(String[] args) {

        Son amit = new Son();
        amit.s();
        amit.F();
        amit.gf();
        System.out.println(amit.gold_gf);

        Father f1 = new Father();
        f1.home();

        GrandFather gf1 = new GrandFather();
        gf1.home();


        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
