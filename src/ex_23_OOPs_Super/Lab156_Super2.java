package ex_23_OOPs_Super;

public class Lab156_Super2 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound();
    }

}


class Animal{

    protected String Name = "Tiger";
    protected String Color = "White";

    void Sound(){
        System.out.println("Animal Sound!!!");
    }

}

class Dog extends Animal{

    protected String color = "Black";
    protected String Name = "Snoopy";

    @Override
    void Sound() {
        super.Sound();
        System.out.println("Bark!!!");
        System.out.println(this.Name);
        System.out.println(this.color);
        System.out.println(super.Name);
        System.out.println(super.Color);
    }
}


