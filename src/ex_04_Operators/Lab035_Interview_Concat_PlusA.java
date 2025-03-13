package ex_04_Operators;

public class Lab035_Interview_Concat_PlusA {
    public static void main(String[] args) {

        String first_name = "Vinod";
        String last_name = "Yadav";

        int a = 200;
        int b = 205;

        System.out.println(first_name + last_name + a + b);
        // // PramodDutta1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);


        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
