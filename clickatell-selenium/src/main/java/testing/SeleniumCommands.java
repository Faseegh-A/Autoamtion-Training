package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;
import java.time.Duration;

public class SeleniumCommands {

    public WebDriver _driver;

    public SeleniumCommands(WebDriver driver){
        this._driver = driver;
    }

    public void navigateToURL(String url){
        this._driver.navigate().to(url);
    }

    public WebElement findAnElement(By by){
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findManyElements(By by){
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        return (List<WebElement>) wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void selectDropdownOption(By by, String option){
        Select dropdown = new Select(findAnElement(by));
        dropdown.selectByVisibleText(option);
    }

    public void clickElement(By by){
        findAnElement(by).click();
    }

    public void sendKeysToElement(By by, String text){
        findAnElement(by).sendKeys(text);
    }

    public String findText(By by){
        return findAnElement(by).getText();
    }



}
