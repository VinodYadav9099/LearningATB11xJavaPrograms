package ex_24_OOPs_Abstraction;

public class Lab157_Abstraction_ex1 {
    public static void main(String[] args) {

        Son S= new Son();
        S.loan_50k();
        S.loan25k();
    }
}



abstract class Father{

    abstract void loan_50k();

    void loan25k(){
        System.out.println("Fathers Loan");
    }
}

class Son extends Father{


    @Override
    void loan_50k() {
        System.out.println("Loan Completed");
    }


}
