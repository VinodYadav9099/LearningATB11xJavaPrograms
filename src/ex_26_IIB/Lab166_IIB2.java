package ex_26_IIB;

public class Lab166_IIB2 {

    // ```
    //IIB
    //Instance initialization Block == IIB
    //I will be executed when Object is created.
    //```
    public static void main(String[] args) {
       new B();
    }
}




class B{

    B(){
        System.out.println("This is a default Constructor");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }

    {
        System.out.println("This is IIB1");

    }

    {
        System.out.println("This is IIB2");
    }

}
