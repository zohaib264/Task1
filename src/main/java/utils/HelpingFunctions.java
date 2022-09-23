package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HelpingFunctions {

    private WebDriver driver;
    public HelpingFunctions(WebDriver driver){
        this.driver = driver;
    }

    public void clickElement(String btn){
        driver.findElement(By.xpath(btn)).click();
    }

    public void inputText(String path,String value){
        driver.findElement(By.xpath(path)).sendKeys(value);
    }

    public String getText(String path){
        return driver.findElement(By.xpath(path)).getText();
    }

    public void HoverOverElement(String path){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath(path))).perform();
    }
}