package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchItemsPage {

    private WebDriver driver;
    public SearchItemsPage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getSearchedItems(String itemName){
        List<WebElement> items = driver.findElements(
                By.xpath("//ul[@class='product_list grid row']/li//h5/a[contains(text(),'"+itemName+"')]")
        );

        return items;
    }

}
