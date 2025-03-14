package Tasks;

/**
 * Create a Program - Take user input & Check weather the input is even or odd number
 * Taking inputs from the user
 * The I/P should be integer Value and O/P is to print the Entered Value is Even or Odd
 * Used If amd else condition
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task006_Odd_Even {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Program is to Check if the Entered number is odd or Even");
        System.out.println("Enter any Integer Number");
        int num = scanner.nextInt();
        if (num%2==0)
        {
            System.out.println("The Entered Number is Even");
        }
        else
        {
            System.out.println("The Entered Number is Odd");
        }


    }
}
