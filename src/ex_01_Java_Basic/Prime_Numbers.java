package ex_01_Java_Basic;

import java.util.Scanner;

public class Prime_Numbers {

    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // num is divisible by i, so it's not prime
                    break;
                }
            }

            // Print the number if it's prime
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
