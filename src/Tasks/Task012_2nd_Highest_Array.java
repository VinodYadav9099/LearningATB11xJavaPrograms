package Tasks;

public class Task012_2nd_Highest_Array {
    public static void main(String[] args) {

        int array[] = {100,89,181,781,901,819,88,889,889,999,1000};
        int max = array[0];
        int max1= array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i]>max){
                max1=max;
                max=array[i];
            }else if(array[i]>max1 && array[i]!=max1) {
                max1 = array[i];
            }
        }
        System.out.println("The Second Largest is " + max1);
    }
}
