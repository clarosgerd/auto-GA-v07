package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.avoidToUse;
import static testingui.diplomadoumss.org.manageevents.Event.clickWebElement;

public class Nasa extends BasePage {
    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaApiListing;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/li/a")
    private WebElement earthLink;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul/li[1]/a")
    private WebElement imageryLink;

    @FindBy(xpath = "/html/body/div[2]/div[2]/p[57]/code")
    private WebElement getApiElement;

    public Nasa() {
        avoidToUse(2);
    }

    public Nasa clickNasaApiListing() {
        clickWebElement(nasaApiListing);
        return this;
    }

    public Nasa reclickNasaApiListing() {
        avoidToUse(1);
        clickWebElement(nasaApiListing);
        return this;
    }

    public Nasa clickEarthLink() {
        avoidToUse(1);
        clickWebElement(earthLink);
        return this;
    }

    public Nasa clickImageryLink() {
        avoidToUse(1);
        clickWebElement(imageryLink);
        return this;
    }

    public boolean compareText() {
        String val = getApiElement.getText();
        val = val.replace("GET", "").trim();
        return (val.equals(PropertyAccesor.getInstance().getURLToCompare()));
    }
}
