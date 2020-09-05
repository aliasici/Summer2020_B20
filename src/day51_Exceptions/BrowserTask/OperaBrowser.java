package day51_Exceptions.BrowserTask;

public class OperaBrowser extends WebDriver{

    @Override
    public void get(String url) {
        System.out.println("Opening the "+url+" in opera browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the opera browser");
    }
}
