package TestScripts;

import objects.CartPageElements;
import objects.HomePageElements;
import objects.ItemDetailsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario3 extends BaseTests{

    @Test
    public void scenario3(){

        helpingFunctions.HoverOverElement(HomePageElements.shopItem1);
        helpingFunctions.clickElement(HomePageElements.addToCartButton);

        waitsManager.WaitForElementVisible(ItemDetailsPageElements.cartModal);

        helpingFunctions.clickElement(ItemDetailsPageElements.closeModalButton);
        helpingFunctions.clickElement(HomePageElements.cartButton);

        Assert.assertEquals(helpingFunctions.getText(CartPageElements.newestElementName),
                "Faded Short Sleeve T-shirts");

    }
}
