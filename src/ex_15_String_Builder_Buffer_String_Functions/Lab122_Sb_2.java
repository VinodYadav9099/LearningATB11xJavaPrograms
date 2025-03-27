package ex_15_String_Builder_Buffer_String_Functions;

public class Lab122_Sb_2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16); // Delete the substring
        System.out.println(sb);
        sb.replace(0, 4, "C++");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Vinod");
        sb1.append(" Yadav");
        System.out.println(sb1);
        sb1.delete(6,11);
        System.out.println(sb1);
        sb1.replace(0,5,"Vismaya");
        System.out.println(sb1);
    }
}
