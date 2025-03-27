package ex_16_Arrays;

public class Lab127_Array_max_min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max_num =  give_max_of_array(array);
        int min_num =  give_min_of_array(array);

        System.out.println(max_num);
        System.out.println(min_num);

    }

    static int give_max_of_array(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }
        static int give_min_of_array(int[] array) {

            int min = array[0];
            for (int i = 0; i < array.length; i++) {

                if (array[i] < min) {
                    min = array[i];
                }


            }

            return min;
        }
    }
