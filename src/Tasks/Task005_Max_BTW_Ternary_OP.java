package Tasks;

import java.util.Scanner;

public class Task005_Max_BTW_Ternary_OP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();
        //System.out.println("Enter the Second Number");
        int result = num1 > num2 ? num1 : num2 ;
        System.out.println("The Maximum Number is " + result);
    }
}
