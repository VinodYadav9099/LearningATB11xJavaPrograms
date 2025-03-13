package ex_05_TypeCasting;

public class Lab049_TypeCasting_Short_Long {
    public static void main(String[] args) {


        long phone_no = 7876543210l;
        //short s = phone_no; // implicit ? Implicit Casting is not possible in Narrowing
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);
    }
}
