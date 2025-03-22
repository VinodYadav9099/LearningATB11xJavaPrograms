package ex_10_For_Loop;

public class Lab087_Invalid_Condition {
    public static void main(String[] args) {

        for (int _1 = 0; _1> 10; _1++) { // 11 times
            System.out.println(_1); // 0, to 10
        }
        System.out.println("End");
    }
}
