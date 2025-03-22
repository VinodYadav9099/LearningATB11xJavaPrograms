package ex_08_If_Condition;

import java.util.Scanner;

public class Lab068_if_CLI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible to go to trip");
        }
        else{
            System.out.println("you are not eligible to go to trip");
        }
       // System.out.println("wrong Input");
    }
}
