package ex_25_OOPs_Abstraction_Interface;

import javax.swing.text.AsyncBoxView;

public class Lab160_MultipleInheritance {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.money();
    }

}

interface Mother{

    void money();
}

interface Father{
    void money();
    }

    class Son implements Mother,Father{

        @Override
        public void money() {
            System.out.println("Son Earned the Money");// Multiple Inheritance is only possible with Interface
        }
    }


