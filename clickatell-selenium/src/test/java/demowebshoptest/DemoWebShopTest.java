package demowebshoptest;

import demoWebShop.DemoWebShop;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShopTest {

    WebDriver _driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        _driver = new ChromeDriver();
        _driver.manage().window().maximize();
    }

    @Test
    public void loginTest(){
        DemoWebShop dws = new DemoWebShop(_driver);

        dws.loginPage.loginUser("fa@clicka.com", "Password01");
        dws.generalPage.desktopPage();


    }
}
