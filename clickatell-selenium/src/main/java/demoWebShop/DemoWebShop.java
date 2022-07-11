package demoWebShop;

import demoWebShop.pages.General;
import demoWebShop.pages.LoginPage;

import org.openqa.selenium.WebDriver;

public class DemoWebShop {

    public LoginPage loginPage; // new LoginPage();
    public General generalPage;

    public DemoWebShop(WebDriver driver){
        this.loginPage = new LoginPage(driver);
        this.generalPage = new General(driver);
    }
}
