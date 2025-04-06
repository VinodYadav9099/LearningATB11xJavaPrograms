package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab149_methodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int add1 = m1.add(3,6,9);
        System.out.println(add1);


    }
}

     class MathOperations{

        public int add(int a, int b){
            return a+b;
        }

         public int add(int a, int b, int c){
             return a+b+c;
         }

         public float add(float a, float b, float c){
             return a+b+c;
         }
    }
