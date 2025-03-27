package Tasks;

public class Task011_Array_Odd_Even {

    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even Number is " + array[i]);
            } else {
                System.out.println("ODD Number is " + array[i]);
            }


        }

    }
}