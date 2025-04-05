package ex_19_OOPs_Inheritance.Single_Inheritance;

public class TestCase2 extends CommonToAll{

    void runningTC2(){


        openBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
