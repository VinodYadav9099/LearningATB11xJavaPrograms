package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab151_methodOverriding2 {
    public static void main(String[] args) {

        commonToAll c1 = new chromeTC();
        c1.openBrowser();

        fireFox f1 = new fireFox();
        f1.openBrowser();

        chromeTC c2 = new chromeTC();
        c2.openBrowser();



    }


}

class commonToAll{

    void openBrowser(){
        System.out.println("Start IE Browser");
    }
}

class chromeTC extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("Chrome Browser will start");
    }
}

class fireFox extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox Browser will start");
    }
}