package ex_26_IIB;

public class Lab165_IIB1 {

    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```

    public static void main(String[] args) {
        A a = new A();
    }
}


class A{

    A(){
        System.out.println("This is a default Constructor and only one DC is allowed");

    }

    {
        System.out.println("Hi, I am IIB1");
        System.out.println("If you want to execute or call something when object is created");
        //Used in following things
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("Hi, I am IIB 2");
    }

    {
        System.out.println("Hi, I am IIB 3");
    }

}
