package Tasks;

import java.util.Scanner;

public class Task009_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check if it is a Palindrome");
        String str = scanner.nextLine();
        String rev_str = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev_str= rev_str+str.charAt(i);
            
        }
        System.out.println(rev_str);
        if(rev_str.equals(str)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        
    }
}
