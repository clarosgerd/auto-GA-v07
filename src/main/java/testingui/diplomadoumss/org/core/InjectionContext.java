package testingui.diplomadoumss.org.core;

public class InjectionContext {

    private DriverManager webDriverManager;
    private PageObjectManager pageObjectManager;

    public InjectionContext() {
        // webDriverManager = new DriverManager();
        pageObjectManager = new PageObjectManager(DriverManager.getInstance().getWebDriver());
    }

    public DriverManager getDriverManager() {
        return webDriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
