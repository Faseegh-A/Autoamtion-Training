package bankApplication;

import bankApplication.pages.AccountPage;
import bankApplication.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BankApplication {
    public LoginPage loginPage;
    public AccountPage accPage;

    public BankApplication(WebDriver driver){
        this.loginPage = new LoginPage(driver);
        this.accPage = new AccountPage(driver);

    }
}
