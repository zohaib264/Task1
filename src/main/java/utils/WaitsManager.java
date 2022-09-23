package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsManager {

    private WebDriver driver;
    public WaitsManager(WebDriver driver){
        this.driver = driver;
    }

    public void WaitForElementVisible(String element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }
    public void WaitForElementClickable(String element){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }
}
