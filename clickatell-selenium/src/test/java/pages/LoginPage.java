package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public By usernameField = By.xpath("//input[@name='user-name']");
    public By passwordField = By.xpath("//input[@name='password']");
    public By loginButton = By.xpath("//input[@type='submit']");

    public WebDriver _driver;


    public LoginPage(WebDriver driver){
        this._driver = driver;
    }



}
