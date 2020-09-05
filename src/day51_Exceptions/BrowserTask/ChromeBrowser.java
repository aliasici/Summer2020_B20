package day51_Exceptions.BrowserTask;

public class ChromeBrowser extends WebDriver {
    /*
    get(url). close()
    overriding must be in CHILD class
     */

    public void get(String url){
        System.out.println("Opening the "+url+" in chrome browser");
    }
    public void close(){
        System.out.println("Closing the chrome browser");
    }


}
