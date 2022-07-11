package demoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.SeleniumCommands;

public class LoginPage {

    public WebDriver _driver;
    private SeleniumCommands cmd;

    public LoginPage(WebDriver driver){
        this._driver = driver;
        this.cmd = new SeleniumCommands(driver);
    }

    private By loginLink = By.xpath("//a[@href=\"/login\"]");
    private By emailField = By.xpath("//input[@id=\"Email\"]");
    private By pswdField = By.xpath("//input[@id=\"Password\"]");
    private By rememberCheckbox = By.xpath("//input[@type=\"checkbox\"]");
    private By loginBtn = By.xpath("//input[@value=\"Log in\"]");

    public void loginUser(String email, String password){
        String url = "https://protect-za.mimecast.com/s/ijcSCMjgzRfqkAyrFwxRq9?domain=demowebshop.tricentis.com/";
        cmd.navigateToURL(url);
        cmd.clickElement(loginLink);
        cmd.sendKeysToElement(emailField, email);
        cmd.sendKeysToElement(pswdField, password);
        cmd.clickElement(rememberCheckbox);
        cmd.clickElement(loginBtn);
    }




}
