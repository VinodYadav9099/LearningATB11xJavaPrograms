package ex_27_Static;

public class Lab170_Static_ex4 {

    public static void main(String[] args) {
        System.out.println(ATB11x.courseName);
        System.out.println(ATB11x.mentorName);

        ATB11x.doAssignment();
        ATB11x.joinZoomForClass();

        ATB11x v1 = new ATB11x();
        v1.howTheyAssignment();
        v1.setName("Vinod");
        v1.setPhone("778187781");
        System.out.println(v1.getName());
        System.out.println(v1.getPhone());
    }
}


class ATB11x{


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB11x";
    static String mentorName = "Pramod";


    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }

    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }


    void howTheyAssignment(){
        System.out.println("It is different!");
    }

        }
