package ex_27_Static;

public class Lab167_Static_IIB {

    public static void main(String[] args) {
        P p1 = new P();
        P p2 = new P();
    }
}




class P {
    static{
        System.out.println("Static SIB");
    }

    {
        System.out.println("IIB1 Block 1");
    }

    {
        System.out.println("IIb Block 2");


    }

    P(){
        System.out.println("DC");
    }
}
