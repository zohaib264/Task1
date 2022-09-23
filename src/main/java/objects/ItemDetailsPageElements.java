package objects;

public interface ItemDetailsPageElements {
    String addToCartButton = "//form[@id='buy_block']//div[@class='box-cart-bottom']//p[@id='add_to_cart']/button";
    String itemDetailsModal = "//div[@class='primary_block row']";
    String cartModal = "//div[@id='layer_cart']/div[@class='clearfix']";
    String addToCardSuccessMsg = "//div[@id='layer_cart']/div[@class='clearfix']/div[@class='layer_cart_product col-xs-12 col-md-6']//h2";
    String closeModalButton = "//div[@id='layer_cart']//div[@class='clearfix']/div/span";
}
