package TestScripts;

import objects.FilterSectionElements;
import objects.HomePageElements;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Scenario2 extends BaseTests{

    @Test
    public void scenario2(){
        helpingFunctions.clickElement(HomePageElements.womenCategoryBtn);
        womensPage.scrollDown();
        helpingFunctions.clickElement(FilterSectionElements.dressesCategoryCheckbox);
        helpingFunctions.clickElement(FilterSectionElements.blackColorCheckbox);
        womensPage.scrollUp();
        waitsManager.WaitForElementVisible(FilterSectionElements.enabledFilters);

        List<WebElement> filters = womensPage.getAppliedFilters(FilterSectionElements.enabledFilters);

        Assert.assertEquals(filters.get(0).getText(),"Categories: Dresses");
        Assert.assertEquals(filters.get(1).getText(),"Color: Black");

    }

}
