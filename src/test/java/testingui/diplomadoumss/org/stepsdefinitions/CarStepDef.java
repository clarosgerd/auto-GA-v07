package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.core.InjectionContext;
import testingui.diplomadoumss.org.managepage.cars.Cars;

public class CarStepDef {

    InjectionContext testContext;
    Cars cars;

    public CarStepDef(InjectionContext context) {
        testContext = context;
        cars = testContext.getPageObjectManager().getCarsPage();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() {
        cars.clickCarsExpand();
    }
}
