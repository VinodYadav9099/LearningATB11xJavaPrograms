package ex_16_Arrays;

public class Lab125_Array_1 {
    public static void main(String[] args) {

        String names[] = {"Vinod","Raksha","Vismaya"};
        System.out.println(names.length);

        String names1[] = new String[5];
        names1[0]= "Vinod";
        names1[1]= "Snoopy";
        names1[2]= "Vismaya";
        names1[3]= "Royal enfield 9099";
        System.out.println(names1.length);
        System.out.println(names1[0]);
        System.out.println(names1[1]);
        System.out.println(names1[2]);
        System.out.println(names1[3]);
        System.out.println(names1[4]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;




    }
}
