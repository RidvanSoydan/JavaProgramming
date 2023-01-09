package day45_Abstraction_Interface.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

        Chrome chromeDriver = new Chrome();

        chromeDriver.get("sss");

        System.out.println(chromeDriver.getBrowserName());

        Edge edgeDriver = new Edge();

        edgeDriver.executeScript("Abc");

        edgeDriver.close();

        FireFox fireFoxDriver = new FireFox();

        fireFoxDriver.findElements("xpath");

    }


}
