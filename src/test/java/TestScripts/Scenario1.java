package TestScripts;

import objects.HomePageElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Scenario1 extends BaseTests{

    public String item = "Printed Dress";

    @Test
    public void scenario1(){
        helpingFunctions.clickElement(HomePageElements.searchBarField);
        helpingFunctions.inputText(HomePageElements.searchBarField,item);
        helpingFunctions.clickElement(HomePageElements.searchBarBtn);

        List<WebElement> itemList = searchItemsPage.getSearchedItems(item);

        for (int i =0;i< itemList.size();i++){
            Assert.assertEquals(itemList.get(i).getText(),item);
        }
    }
}
