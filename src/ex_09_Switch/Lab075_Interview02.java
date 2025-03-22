package ex_09_Switch;

import java.util.Scanner;

public class Lab075_Interview02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ch Value");
        int ch = scanner.nextInt();
        //char ch = 'A';
        //char ch1= 'B';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII A");
                break;
            case 66:
                System.out.println("Match ASCII B");
                break;
            default:
                System.out.println("No Match");

        }
    }
}
