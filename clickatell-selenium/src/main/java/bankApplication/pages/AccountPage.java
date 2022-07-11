package bankApplication.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.SeleniumCommands;

public class AccountPage {
    public WebDriver driver;
    private SeleniumCommands cmd;

    private By depositSelector = By.xpath("//button[@ng-click='deposit()']");
    private  By withDrawalSelector  = By.xpath("//button[@ng-click='withdrawl()']");
    private By amountInput = By.xpath("//input[@type='number']");
    private By actionBtn = By.xpath("//button[@type='submit']");
    private  By actionMessage = By.xpath("//span[@ng-show='message']");

    public AccountPage(WebDriver driver){
            this.driver = driver;
            this.cmd = new SeleniumCommands(driver);
    }

    public boolean makeDeposit(int amount){
        cmd.clickElement(depositSelector);
        cmd.sendKeysToElement(amountInput,amount+"");
        cmd.clickElement(actionBtn);
        return cmd.findAnElement(actionMessage).isDisplayed();
    }

    public boolean makeWithdrawal(int amount){
        cmd.clickElement(withDrawalSelector);
        cmd.sendKeysToElement(amountInput,amount+"");
        cmd.clickElement(actionBtn);
        return cmd.findAnElement(actionMessage).isDisplayed();
    }

}
