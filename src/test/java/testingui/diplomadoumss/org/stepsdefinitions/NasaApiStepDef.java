package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.managepage.nasa.Nasa;

import static org.testng.Assert.assertEquals;
import static testingui.diplomadoumss.org.manageloadpage.LoadPage.loadNasaPage;


public class NasaApiStepDef {

    private Nasa nasa;

    @Given("^I Open the Nasa Page$")
    public void iOpenTheNasaPage() {
        nasa = loadNasaPage();
    }

    @And("^click 'NasaApiListing' link on 'Left Panel' page #$")
    public void clickNasaApiListingLinkOnLeftPanelPage() {
        nasa = nasa.clickNasaApiListing();
    }

    @And("^newClick 'NasaApiListing' link on 'Left Panel' page$")
    public void newclickNasaApiListingLinkOnLeftPanelPage() {
        nasa = nasa.reclickNasaApiListing();
    }

    @And("^click 'Earth' link on 'Left Panel' page$")
    public void clickEarthLinkOnLeftPanelPage() {
        nasa = nasa.clickEarthLink();
    }

    @And("^click 'Imagering' sublink on 'LeftPanel' page$")
    public void clickImageringSublinkOnLeftPanelPage() {
        nasa = nasa.clickImageryLink();
    }

    @Then("^verify the 'GETUrl' isEquals to 'urlGetText' in page$")
    public void verifyTheGETUrlIsEqualsToUrlGetTextInPage() {
        assertEquals(nasa.compareText(), true);
    }
}
