package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.DriverFactory;

public class IndexSteps extends DriverFactory {

    @Given("^The user is on the \"([^\"]*)\" website$")
    public void the_user_is_on_the_website(String url) throws Throwable {
        getDriver().get(url);
    }

    @And("^The user types \"([^\"]*)\" in the text area field$")
    public void the_user_types_in_the_text_area_field(String search) throws Throwable {
        indexPage.enterSearchQuery(search);
    }

    @And("^The user click the search button$")
    public void the_user_click_the_search_button() throws Throwable {
        indexPage.clickTheSearchButton();
    }

    @And("^The page reloads with summer dresses results$")
    public void the_page_reloads_with_summer_dresses_results() throws Throwable {
        indexPage.pageReloadsSummerDressesResults();
    }

    @And("^The user clicks on the printed summer dress$")
    public void the_user_adds_the_printed_summer_dress_to_the_cart() throws Throwable {
        indexPage.clickOnSummerDress();
    }

    @And("^The user clicks on add to cart button$")
    public void the_user_clicks_the_pop_alert_proceed_to_checkout() throws Throwable {
        indexPage.clickAddToCart();
    }

    @And("^Pop alert message is displayed with a message$")
    public void dress_is_added_to_the_cart_in_the_summary_page() throws Throwable {
        indexPage.popAlertMessageIsDisplayed();
    }

    @And("^The user clicks the proceed to checkout button on the pop alert$")
    public void the_user_clicks_the_proceed_to_checkout_button() throws Throwable {
        indexPage.clickToProceedToCheckout();
    }

    @And("^The user click the proceed to checkout button$")
    public void the_user_click_the_proceed_to_checkout_button() throws Throwable {
        indexPage.finalClickToProceedMessage();
    }

    @Then("^The user is presented with authentication Sign in section$")
    public void the_user_is_presented_with_authentication_Sign_in_section() throws Throwable {
        indexPage.authenticationsSignInIsPresented();
    }
}
