package ex_22_OOPs_AccessModifiers.Police;

public class Lab154_Encap {

}


class Father{
    private int gold =10;
    protected int bhk3 =10;
    int car =1;
}

class Son extends Father{


    void getGold(){
//        System.out.println(gold);
        System.out.println(bhk3);
    }
}