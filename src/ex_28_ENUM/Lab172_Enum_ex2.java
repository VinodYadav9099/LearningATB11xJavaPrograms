package ex_28_ENUM;

public class Lab172_Enum_ex2 {


    public static void main(String[] args) {


        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());
        System.out.println(Locators.page_name.getLocators());


        System.out.println("-------------------------------");

        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());

        System.out.println("-------------------------------");

        System.out.println(Colors.BLUE.getHexcode());
        System.out.println(Colors.GREEN.getHexcode());


    }
}
