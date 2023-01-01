package day38_Inheritance.browserTask;

public class Chrome extends Browser{


    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }

}
