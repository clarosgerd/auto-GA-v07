package testingui.diplomadoumss.org.managepage.login;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Login  {



    @FindBy(xpath ="//*[@id=\"exampleInputEmail1\"]")
    private WebElement userNameField;

    @FindBy(xpath ="//*[@id=\"exampleInputPassword1\"]")
    private WebElement passwordField;

    @FindBy(xpath ="//*[@id=\"page-wrapper\"]/div/div/div/div/div[2]/form/button")
    private WebElement loginButton;

//.form-signin input[type="password"]
//    @FindBy(xpath = "//input[@name='email' and @type='email']")
//    private WebElement emailTextField;

   // public void setEmail(String email){
        //emailTextField.sendKeys(email);
    //}


    public void clickLoging()    {
        loginButton.click();
    }

    public void setUserPP(String user)
    {
        userNameField.sendKeys(user);
    }
    public void setPasswordField(String pass)
    {
        passwordField.clear();
        passwordField.sendKeys(pass);
        passwordField.sendKeys(Keys.TAB);
    }

}
