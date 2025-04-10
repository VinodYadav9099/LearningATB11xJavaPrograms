package ex_28_ENUM;

public class Lab172_Enum_ex1 {

    public static void main(String[] args) {
        System.out.println(Days.Monday);
        System.out.println(PROJECT_URLs.google);
    }
}


//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}

enum Days{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

enum PROJECT_URLs{
    google, restassured, katalon, vwo
}
