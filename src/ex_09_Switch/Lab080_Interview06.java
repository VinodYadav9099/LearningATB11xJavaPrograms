package ex_09_Switch;

import java.util.Scanner;

public class Lab080_Interview06 {
    public static void main(String[] args) {

        // in JDK > 13
        //int itemCode = 001;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Item Code");
        int itemCode = scanner.nextInt();
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
