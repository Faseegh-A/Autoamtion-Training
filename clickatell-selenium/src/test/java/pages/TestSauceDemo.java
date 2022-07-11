package pages;

import bankApplication.BankApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testing.SeleniumCommands;
import static org.testng.Assert.*;

import java.time.Duration;

public class TestSauceDemo {
    WebDriver _driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
    }

    @AfterTest
    public void closeBrowser(){
        //_driver.quit();
        //_driver.close();

    }

    @Test
    public void loginToWayToAutomate() throws InterruptedException {
        BankApplication bankApp = new BankApplication(_driver);

        bankApp.loginPage.loginUser("Harry Potter");

        bankApp.accPage.makeDeposit(2500);
        bankApp.accPage.makeWithdrawal(100);



        //_driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
/*
        cm.clickElement(By.xpath(""));
//        _driver.findElement(By.xpath("//*[text()='Customer Login']")).click();

        cm.selectDropdownOption(By.xpath("//select[@id=\"userSelect\"]"),"Harry Potter");
        //Select user = new Select(_driver.findElement(By.xpath("//select[@id=\"userSelect\"]")));
        //user.selectByVisibleText("Harry Potter");

        cm.clickElement(By.xpath("//button[@type='submit']"));
        //_driver.findElement(By.xpath("//button[@type='submit']")).click();

        cm.clickElement(By.xpath("//button[@ng-click='deposit()']"));
        cm.sendKeysToElement(By.xpath("//input[@type='number']"),"5000");
        cm.clickElement(By.xpath("//button[@type='submit']"));

        assertEquals(cm.findText(By.xpath("//span[@ng-show='message']")),"Deposit Successful");
        cm.clickElement(By.xpath("//button[@class='btn logout']"));
        //_driver.quit();*/
    }
}
