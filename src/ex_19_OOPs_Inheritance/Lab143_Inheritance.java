package ex_19_OOPs_Inheritance;

public class Lab143_Inheritance {
    public static void main(String[] args) {

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        s1.bh3();
        System.out.println(s1.gold_f);
        s1.bhk2();

        //f1.bhk3(); Cannot access because Son class extends the Father it is only one way.



    }

}


    class Father{

        int gold_f = 1000;  // Attribute | Data variables |  Property | Instance Variables


        void bhk2(){ //  Behaviour |  Method | Function | Data members

            System.out.println("Father-2BHK");
        }
    }

    class Son extends Father{

        void bh3(){
            System.out.println("Son-3BHK");
        }
    }


