package bankApplication.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.SeleniumCommands;


public class LoginPage {

    public WebDriver driver;
    private SeleniumCommands cmd;

    private By customerLoginBtn = By.xpath("//*[text()='Customer Login']");
    private By selectUserFromDropdown = By.xpath("//select[@id='userSelect']");
    private By loginBtn = By.xpath("//button[@type='submit']");


    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.cmd = new SeleniumCommands(driver);
    }

    public void loginUser(String username){
        String url = "https://www.way2automation.com/angularjs-protractor/banking/#/login";
        cmd.navigateToURL(url);
        cmd.clickElement(customerLoginBtn);
        cmd.selectDropdownOption(selectUserFromDropdown, username);
        cmd.clickElement(loginBtn);
    }
}
