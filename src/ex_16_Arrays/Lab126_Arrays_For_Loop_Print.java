package ex_16_Arrays;

import java.util.Arrays;

public class Lab126_Arrays_For_Loop_Print {
    public static void main(String[] args) {

        int marks[] = {91,56,45,90,43,89,10};
        System.out.println(marks[0]);
        System.out.println(marks[1]);// instead of doing this we can use the for loop
        //here in the array the inde will start from 0 so the i value will always start from 0
        System.out.println(marks.length);
        System.out.println("-------------------------");

        Arrays.sort(marks);

        System.out.println("--------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}
