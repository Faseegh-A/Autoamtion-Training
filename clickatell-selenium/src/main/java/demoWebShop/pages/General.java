package demoWebShop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.SeleniumCommands;

public class General {

    public WebDriver _driver;
    private SeleniumCommands cmd;

    public General(WebDriver driver){
        this._driver = driver;
        this.cmd = new SeleniumCommands(driver);
    }

    private By computerslink = By.xpath("//ul[@class=\"top-menu\"]//a[@href=\"/computers\"]");
    private By desktoplink = By.xpath("//div[@class=\"picture\"]//a[@href=\"/desktops\"]");
    private By emailField = By.xpath("//input[@id=\"Email\"]");
    private By pswdField = By.xpath("//input[@id=\"Password\"]");
    private By rememberCheckbox = By.xpath("//input[@type=\"checkbox\"]");
    private By loginBtn = By.xpath("//input[@value=\"Log in\"]");


    public void desktopPage(){
        cmd.clickElement(computerslink);
        cmd.clickElement(desktoplink);

    }
}
