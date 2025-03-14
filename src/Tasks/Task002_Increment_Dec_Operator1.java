package Tasks;

public class Task002_Increment_Dec_Operator1 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A + B + C
        // A -> ++a -> ExpA -> 11, a = 11
        // +
        // B -> a++ -> ExpB -> 11 , a = 12
        //+
        // C -> a++ -> ExpB -> 12 , a = 13
        // A+B ->  ExpA + ExpB + C -> 11+11+12

        // Line No. |  a |  Exp
        // 5 | 10 | NA |
        // 6 | 13 | 11+11+12 -> 34

        // O/P==> 34,13

    }
}
