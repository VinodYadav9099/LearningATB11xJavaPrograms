package ex_12_DoWhile;

import java.sql.SQLOutput;

public class Lab103_DoWhile {
    public static void main(String[] args) {

         int a = 0;
         do{
             System.out.println("This will execute atleast once");
             System.out.println(a);
             a++;
         }while(a<10);

    }
}
