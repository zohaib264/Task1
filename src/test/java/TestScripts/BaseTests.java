package TestScripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CartPage;
import pages.HomePage;
import pages.SearchItemsPage;
import pages.WomensPage;
import utils.Config;
import utils.HelpingFunctions;
import utils.WaitsManager;

import java.util.concurrent.TimeUnit;

public class BaseTests extends Config {

    private EventFiringWebDriver driver;
    public HelpingFunctions helpingFunctions;
    public WaitsManager waitsManager;
    public HomePage homePage;
    public SearchItemsPage searchItemsPage;
    public WomensPage womensPage;
    public CartPage cartPage;

    @BeforeClass
    public void setUp(){
        System.setProperty(driverName,driverPath);
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        helpingFunctions = new HelpingFunctions(driver);
        waitsManager = new WaitsManager(driver);
        homePage = new HomePage(driver);
        searchItemsPage = new SearchItemsPage(driver);
        womensPage = new WomensPage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
}
