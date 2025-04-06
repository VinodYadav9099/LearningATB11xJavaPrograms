package ex_21_OOPs_Encapsulation;

public class Lab152_Encapsulation_Demo {
    public static void main(String[] args) {

        vwoLogin v1 = new vwoLogin("Vinod", "pswd1234");
        System.out.println(v1.password);
        v1.password = "456tgjs";
        System.out.println(v1.password);

        GoodVWOLogin g1 = new GoodVWOLogin("Vismaya", "Vinu@90gh");
        System.out.println(g1.getPassword());
        g1.setPassword("Vismaya8892", false);


    }
}

class vwoLogin{

    public String username;
    public  String password;

    vwoLogin(String usr, String pswd){
        this.username=usr;
        this.password=pswd;

    }


}

class GoodVWOLogin {

    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin= true){
            this.password = password;
        }
        else{
            System.out.println("Cannot Change");
        }
    }

    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}
