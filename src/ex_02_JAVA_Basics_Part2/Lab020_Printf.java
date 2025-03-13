package ex_02_JAVA_Basics_Part2;

public class Lab020_Printf {
    public static void main(String[] args) {

        int a = 10;
        System.out.printf("You variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        String c = "Vinod";
        float n = 2.15f;
        boolean B = true;


        System.out.println( " --- ");
        System.out.printf("%d + %d",a,b);
        System.out.println( " --- ");
        System.out.printf("%s", c);
        System.out.println( " --- ");
        System.out.printf("%f", n);
        System.out.println( " --- ");
        System.out.printf("%b", B);

    }
}
