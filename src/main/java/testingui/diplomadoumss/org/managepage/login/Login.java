package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login extends BasePage {

    @FindBy(linkText="LoginForm")
    @CacheLookup
    private WebElement LoginFormpage;

    @FindBy(css = "#btnLogin")
    private WebElement loginclick;

    @FindBy(css="input[id^='username']")
    @CacheLookup
    private WebElement userNameField;

    @FindBy(css="input[id^='password']")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(css="button.btn.btn-success")
    private WebElement loginButton;


//    @FindBy(xpath = "//input[@name='email' and @type='email']")
//    private WebElement emailTextField;

   // public void setEmail(String email){
        //emailTextField.sendKeys(email);
    //}


    public void clickLoging()    {
        loginclick.click();
    }

    public WebElement getLoginFormpage()    {
        return LoginFormpage;
    }

    public void setUserPP(String user)
    {
        userNameField.clear();
        userNameField.sendKeys(user);
    }
    public void setPasswordField(String pass)
    {
        passwordField.clear();
        passwordField.sendKeys(pass);
        passwordField.sendKeys(Keys.TAB);
    }
    public WebElement getUserNameField(){
        return userNameField;
    }
    public WebElement getLoginButton()
    {
        return loginButton;
    }


}
