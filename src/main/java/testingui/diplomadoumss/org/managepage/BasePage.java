package testingui.diplomadoumss.org.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testingui.diplomadoumss.org.core.DriverManager;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class BasePage {

    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);

    }

    public void userLogin(String user, String password ) {
        Login login = PageFactory.initElements(webDriver,Login.class);
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement until= wait.until(ExpectedConditions.visibilityOf(login.getLoginFormpage()));

        Actions action = new Actions(webDriver);
        action.moveToElement(login.getUserNameField()).build().perform();

        action.click(login.getUserNameField()).perform();

        login.setUserPP(user);
        login.setPasswordField(password);
        login.clickLoging();
    }
}
