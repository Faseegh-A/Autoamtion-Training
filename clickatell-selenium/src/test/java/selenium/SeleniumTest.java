package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SeleniumTest {

/*
    @BeforeTest
    public WebDriver set_up_browser(){
        String test_url = "https://parabank.parasoft.com";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(test_url);
        return driver;
    }*/

    @Test
    public void firstTest() throws InterruptedException {

        String test_url = "https://parabank.parasoft.com";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(test_url);

        driver.findElement(By.name("username")).sendKeys("john");
        driver.findElement(By.name("password")).sendKeys("demo");

        driver.findElement(By.xpath("//input[@value]")).click();

        //WebElement title = driver.findElement(By.xpath("/html/head/title"));
        String title = driver.getTitle();
        //System.out.println(title.getText());
        assertEquals("ParaBank | Accounts Overview",title);
        //assertEquals();

        WebElement element = driver.findElement(By.xpath("//h1[text()='Accounts Overview']"));
        assertTrue(element.isDisplayed());

        driver.findElement(By.xpath("//a[text()=\"Request Loan\"]")).click();

        driver.findElement(By.xpath("//input[@id=\"amount\"]")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@id=\"downPayment\"]")).sendKeys("100");
        Select dropdown = new Select(driver.findElement(By.id("fromAccountId")));
        dropdown.selectByVisibleText("12345");
        driver.findElement(By.xpath("//input[@type]")).click();
        System.out.println("Before finding loanStatus element");

        List<WebElement> tb = driver.findElements(By.xpath("//td"));
        
        assertEquals(tb.get(tb.size()-1).getText(),"Approved");

        Thread.sleep(3000);
        driver.quit();
    }

/*
    @Test
    public void testDisplayedElements(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(test_url);
        WebElement element = driver.findElement(By.)
    }*/
}
