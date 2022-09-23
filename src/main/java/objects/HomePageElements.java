package objects;

public interface HomePageElements {

  String homeBtn = "";
  String searchBarField = "//form[@id='searchbox']//input[@id='search_query_top']";
  String searchBarBtn = "//button[@name='submit_search']";
  String womenCategoryBtn = "//div[@id='block_top_menu']/ul/li[1]";
  String dressesCategoryBtn = "//div[@id='block_top_menu']/ul/li[2]";
  String tShirtsCategoryBtn = "//div[@id='block_top_menu']/ul/li[3]";
  String shopItem1 = "//ul[@id='homefeatured']/li[1]//div[@class='product-image-container']";
  String addToCartButton = "//ul[@id='homefeatured']//li[1]//div[@class='button-container']//span[contains(text(),'Add to cart')]";
  String cartButton = "//div[@class='shopping_cart']/a";
}
