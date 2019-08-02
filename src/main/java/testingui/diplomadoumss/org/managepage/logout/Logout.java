package testingui.diplomadoumss.org.managepage.logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Logout {

    WebDriver driver;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"logout\"]/a")
    private WebElement buttonlogut;


    public void clickLoguot() {
        avoidToUse(3);
        clickWebElement(buttonlogut);

    }

}
