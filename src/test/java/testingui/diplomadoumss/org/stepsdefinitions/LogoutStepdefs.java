package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.core.InjectionContext;
import testingui.diplomadoumss.org.managepage.logout.Logout;

public class LogoutStepdefs {

    InjectionContext testContext;
    Logout logout;

    public LogoutStepdefs(InjectionContext context) {
        testContext = context;
        logout = testContext.getPageObjectManager().getLogout();
    }

    public LogoutStepdefs() {

    }


    @And("^click 'Logout' button on 'Header' page$")
    public void clickLogoutButtonOnHeaderPage() {
        logout.clickLoguot();
    }
}
