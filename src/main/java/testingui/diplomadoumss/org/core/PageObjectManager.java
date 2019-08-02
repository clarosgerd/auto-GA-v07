package testingui.diplomadoumss.org.core;

import org.openqa.selenium.WebDriver;
import testingui.diplomadoumss.org.managepage.cars.Cars;
import testingui.diplomadoumss.org.managepage.login.Login;
import testingui.diplomadoumss.org.managepage.logout.Logout;

public class PageObjectManager {


    WebDriver driver;

    Login login;
    Cars cars;
    Logout logout;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }


    public Login getHomePage() {
        return (login == null) ? new Login(driver) : login;
    }


    public Cars getCarsPage() {
        return (cars == null) ? new Cars(driver) : cars;
    }


    public Logout getLogout() {
        return (logout == null) ? new Logout(driver) : logout;
    }
/*
    public CartPage getCartPage() {
        return (cartPage == null) ? new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage() {

        return (checkoutPage == null) ? new CheckoutPage(driver) : checkoutPage;
    }*/
}
