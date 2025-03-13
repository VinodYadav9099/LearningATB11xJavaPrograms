/**
 * Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
 *
 * A: 90-100
 *
 * B: 80-89
 *
 * C: 70-79
 *
 * D: 60-69
 *
 * F: 0-59
 */
package ex_06_Ternary_Operator;

public class Lab058_Assignment_Ternary {
    public static void main(String[] args) {

        String marks1 = args[0];
        System.out.println(marks1);
        System.out.println(marks1 instanceof String);

        int marks = Integer.parseInt(marks1);

        String result = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 70) ? "c" :
                (marks >= 60) ? "D" : "F";

        System.out.println(result);



    }
}
