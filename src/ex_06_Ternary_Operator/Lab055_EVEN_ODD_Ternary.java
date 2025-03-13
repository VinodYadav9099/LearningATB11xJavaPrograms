package ex_06_Ternary_Operator;

public class Lab055_EVEN_ODD_Ternary {
    public static void main(String[] args) {

        int num = 1024;
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
