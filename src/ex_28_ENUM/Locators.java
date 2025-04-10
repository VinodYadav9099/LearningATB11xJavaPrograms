package ex_28_ENUM;

public enum Locators {

    page_button("#btn"),
    page_input("#input1"),
    page_name("#pnme");

    private String Locators;

    Locators(String Locators){
        this.Locators=Locators;
    }
    String getLocators(){
        return this.Locators;
    }

}
