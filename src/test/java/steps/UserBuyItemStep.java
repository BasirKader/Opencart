package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class UserBuyItemStep  extends CommonMethods {
    @When("User clicks on View cart")
    public void user_clicks_on_view_cart() {

    }
    @When("User changes quantity to two")
    public void user_changes_quantity_to_two() {

    }
    @When("User clicks on the Checkout button")
    public void user_clicks_on_the_checkout_button() {

    }
    @Then("User get Not In Stock message")
    public void user_get_not_in_stock_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
