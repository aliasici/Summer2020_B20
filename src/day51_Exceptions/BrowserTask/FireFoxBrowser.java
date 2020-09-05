package day51_Exceptions.BrowserTask;

public class FireFoxBrowser extends WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Opening the "+url+" in firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the firefox browser");
    }
}
