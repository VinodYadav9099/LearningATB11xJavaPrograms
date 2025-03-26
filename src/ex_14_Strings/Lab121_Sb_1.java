package ex_14_Strings;

public class Lab121_Sb_1 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Vinod");
        stringBuilder.append("Yadav");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer("Vinod");
        stringBuffer.append("Yadav1");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";//SCP
        String s2 = " World!";//SCP
        String s3 = s1 + s2; // Creates a new string "Hello World!" along with
        // this Hello and World also will pe present in the SCP
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);
    }
}
