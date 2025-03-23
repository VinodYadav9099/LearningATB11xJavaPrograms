package ex_13_Functions;

public class Lab107_User_Defined_Methods {
    public static void main(String[] args) {
        int r1 = sum_of_two_numbers(3,4);
        int r2 = sum_of_two_numbers(77,97);
        System.out.println(r1);
        System.out.println(r2);

    }

    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
}
