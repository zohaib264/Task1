package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomensPage {

    private WebDriver driver;
    public WomensPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
    }

    public void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-400)", "");
    }

    public List<WebElement> getAppliedFilters(String xpath){
        List<WebElement> items = driver.findElements(By.xpath(xpath));
        return items;
    }
}
