package day38_Inheritance.browserTask;

public class FireFox extends Browser {


    @Override
    public void openBrowser() {
        System.out.println("Opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }

}