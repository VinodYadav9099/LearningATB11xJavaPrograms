package Tasks;

import java.util.Scanner;

public class Task008_Vowels_Consonents {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str=sc.next();
        int vow=0,con=0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vow++;
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vow++;
            else
                con++;
        }
        System.out.println("Vowels - "+vow+"\nConsonants - "+con);
    }
}
