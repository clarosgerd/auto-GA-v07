package testingui.diplomadoumss.org.manageloadpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoadPage {
    WebDriver driver;

    public LoadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loadPPHPTravels() {
        driver.get(PropertyAccesor.getInstance().getURL());
    }

    public void setCredentials() {
        driver.get(PropertyAccesor.getInstance().getURL() + "/admin");
    }
}
