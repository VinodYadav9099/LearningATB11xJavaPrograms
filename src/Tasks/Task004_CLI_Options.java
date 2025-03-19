package Tasks;

import java.util.Scanner;

/**
 * Take a user input - Name, Age and Salary and print them in the end.
 * It can be using the Scanner class or Arguments.
 */

public class Task004_CLI_Options {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = scanner.nextLine();
        System.out.println("Enter your Age");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();
        System.out.println("Name is: " + name);
        System.out.println("Salary is: " + salary);
        System.out.println("Age is: " + age);
        scanner.close();

    }
}
