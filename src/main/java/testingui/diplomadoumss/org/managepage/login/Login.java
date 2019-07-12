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



    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[1]")
    private WebElement userNameField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/div[1]/input[2]")
    private WebElement passwordField;

    @FindBy(xpath ="/html/body/div[1]/form[1]/button")
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
