package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/form[1]/div[1]/input[1]")
    private WebElement emailTextField;

    @FindBy(xpath = "/html/body/div[1]/form[1]/div[1]/input[2]")
    private WebElement passwordTextField;

    @FindBy(xpath = "//html/body/div[1]/form[1]/button")
    private WebElement loginButton;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;


    @FindBy(xpath = "//a/strong[contains(text(), 'Logout')]")
    private WebElement logoutLink;

    public void logoutLink() {
        clickWebElement(logoutLink);
        avoidToUse(4);
    }


    public void clickCarsExpand() {
        clickWebElement(carsExpand);
        //return this;
    }

    public String getLoginLabelButton() {

        return getWebElementText(loginButton);
    }

    public Login setEmail(String email){
        avoidToUse(4);
        fillWebElement(emailTextField, email);
        return this;
    }

    public Login setPassword(String password){
        fillWebElement(passwordTextField, password);
        return this;
    }

    public void clickLoginButton() {
        clickWebElement(loginButton);
        //  return new Login();
    }

    public void setCredentials() {
        setEmail(PropertyAccesor.getInstance().getEmail());
        setPassword(PropertyAccesor.getInstance().getPassword());
        clickLoginButton();
    }

    public void loadPPHPTravels() {
        driver.get(PropertyAccesor.getInstance().getURL() + "/admin");
    }


}
