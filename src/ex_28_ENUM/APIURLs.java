package ex_28_ENUM;

public enum APIURLs {

    vwo("https:vwo.com"),
    google("https.google.com");


    private String Url;

            APIURLs (String Url){
                 this.Url= Url;
            }

            String getUrl(){

                    return this.Url;


            }
}
