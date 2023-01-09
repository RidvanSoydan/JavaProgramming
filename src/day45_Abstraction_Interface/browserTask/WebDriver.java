package day45_Abstraction_Interface.browserTask;

public interface WebDriver extends SearchContext{

    @Override
    void findElement(String locator);

    @Override
    void findElements(String locator);

    void get(String url);
    void close();
    void quit();
    void getTitle();

}
