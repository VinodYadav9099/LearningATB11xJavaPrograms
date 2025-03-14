package Tasks;

public class Task003_Increment_Dec_Operators2 {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(--a + a++ + a--);

        // A + B + C
        // A -> --a -> ExpA -> 20, a = 19
        // +
        // B -> a++ -> ExpB -> 19 , a = 20
        //+
        // C -> a-- -> ExpB -> 20 , a = 19
        // A+B ->  ExpA + ExpB + C -> 19+20+19

        // Line No. |  a |  Exp
        // 5 | 19 | NA |
        // 6 | 19 | 19+20+19 -> 58

        // O/P==> 19,58


    }
}
