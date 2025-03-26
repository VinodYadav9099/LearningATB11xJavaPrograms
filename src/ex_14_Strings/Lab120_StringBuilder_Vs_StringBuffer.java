package ex_14_Strings;

public class Lab120_StringBuilder_Vs_StringBuffer {
    public static void main(String[] args) {

        // String - 90%
        String s0 = "Vinod";
        String s1 = new String("Vinod");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Vinod");
        StringBuilder stringBuilder = new StringBuilder("Vinod");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


    }

}
