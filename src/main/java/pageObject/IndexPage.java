package pageObject;

import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class IndexPage extends BasePage {

    public @FindBy(id = "search_query_top") WebElement searchBox;
    By clickTheSeachButton = By.cssSelector("button[name='submit_search']");
    By summerDressResults = By.xpath("//span[@class='heading-counter']");
    By clickImage  = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']");
    By addToCart = By.xpath("//span[contains(text(),'Add to cart')]");
    By popAlert = By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]");
    By proceedToCheckoutPopAlert = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    By procceedToCheckout = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    By signIn = By.xpath("//span[contains(text(),'Sign in')]");

    public IndexPage() throws IOException {
        super();
    }

    //Query summer dresses in the text field
    public IndexPage enterSearchQuery(String text) throws Exception {
        sendKeysToWebElement(searchBox,text);
        return new IndexPage();
    }
    
    //Click the serach box
    public IndexPage clickTheSearchButton() throws IOException {
        getDriver().findElement((clickTheSeachButton)).click();
        return new IndexPage();
    }

    //Page Reloads
    public IndexPage pageReloadsSummerDressesResults() throws IOException {
        Assert.assertEquals(getDriver().findElement(summerDressResults).getText(),"4 results have been found.");
        return new IndexPage();
    }

    //Click summerd dresses link
    public IndexPage clickOnSummerDress() throws InterruptedException, IOException {
        WebElement element = getDriver().findElement(clickImage);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        element.click();
        return new IndexPage();
    }

    //Adding to cart
    public IndexPage clickAddToCart() throws IOException {
        WebElement element = getDriver().findElement(addToCart);
        waiUntilWebElementIsVisible(element);
        element.click();
        return new IndexPage();
    }
    
    //Pop alert message 
    public IndexPage popAlertMessageIsDisplayed() throws IOException {
        WebElement element = getDriver().findElement(popAlert);
        waiUntilWebElementIsVisible(element);
        Assert.assertEquals(element.getText().toLowerCase(),"product successfully added to your shopping cart");
        return new IndexPage();
    }
    
    //Proceed to checkout
    public IndexPage clickToProceedToCheckout() throws IOException {
        getDriver().findElement(proceedToCheckoutPopAlert).click();
        return new IndexPage();
    }

    //Proceed to checkout before the sign in page
    public IndexPage finalClickToProceedMessage() throws IOException {
        getDriver().findElement(procceedToCheckout).click();
        return new IndexPage();
    }

    //Performing assertion
    public IndexPage authenticationsSignInIsPresented() throws IOException {
        WebElement element = getDriver().findElement(signIn);
        waiUntilWebElementIsVisible(element);
        if (element.isDisplayed()) {
            Assert.assertEquals(element.getText().toLowerCase().replaceAll("[ ()0-9]",""), ".signin");
        }
        return new IndexPage();
    }
}
