package testingui.diplomadoumss.org.managepage.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class Dashboard {
    WebDriver driver;

    public Dashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(text(), 'Bookings')]")
    private WebElement bookingLink;

    @FindBy(xpath = "//ul[@id='social-sidebar-menu']//a[contains(., 'Cars') and @aria-expanded='false']")
    private WebElement carsExpand;

    public Dashboard() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Dashboard clickCarsExpand() {
        clickWebElement(carsExpand);
        return this;
    }
}
