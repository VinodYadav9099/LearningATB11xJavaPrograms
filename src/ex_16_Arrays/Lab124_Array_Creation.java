package ex_16_Arrays;

public class Lab124_Array_Creation {
    public static void main(String[] args) {

        int []marks = {1,2,3,4,5,6};

        //another way of Creating the arrays

        int marks1[] = new int[5];

        //int[] marks = {1, 2, 3, 4, 5, 6};

        // 2nd way to create the array
        int[] mark2 = new int[5]; // Fixed Size
        int mark3[] = new int[5]; // Fixed Size
        int mark4 = 10;
        String[] names = new String[3];
        names[0] = "pramod";
        names[1] = "Amit";
        names[2] = "Yasho";

        System.out.println(marks[0]);
    }
}
