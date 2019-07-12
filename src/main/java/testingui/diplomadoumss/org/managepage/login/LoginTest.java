package testingui.diplomadoumss.org.managepage.login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;


public class LoginTest extends BasePage {
    private WebDriver webDriver;

    @BeforeClass
    public void init() {
        webDriver = getWebDriver();
        webDriver.get(PropertyAccesor.getInstance().getURL());
    }

 @Test
    public void userLogin() {

        Login login = PageFactory.initElements(webDriver,Login.class);
        login.setUserPP(PropertyAccesor.getInstance().getUsername());
        login.setPasswordField(PropertyAccesor.getInstance().getPasssword());
        login.clickLoging();
    }
}
