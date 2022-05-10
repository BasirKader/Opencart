package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class UserRegistrationSteps extends CommonMethods {



    @When("user clicks on My Account")
    public void user_clicks_on_my_account() {
        click(userRegistration.myAcctBtn);
    }

    @When("user clicks on Register")
    public void user_clicks_on_register() {
       click(userRegistration.registerBtn);
    }

    @When("user enters {string} {string} {string} {string} {string} and {string}")
    public void user_enters_and(String string, String string2, String string3, String string4, String string5, String string6) {
        sendText(userRegistration.firstNameBox,"hello");
        sendText(userRegistration.lastNameBox,"hello");
        sendText(userRegistration.emailBox,"hello@aol.com");
        sendText(userRegistration.phoneBox,"hello");
        sendText(userRegistration.passwordBox,"hello");
        sendText(userRegistration.passwordConfirmBox,"hello");
    }


    @When("user selects on subscribe button")
    public void user_selects_on_subscribe_button() {
        click(userRegistration.radioButton);
    }

    @When("user clicks on checkbox")
    public void user_clicks_on_checkbox() {
        click(userRegistration.checkBox);
    }

    @Then("user clicks on continue tab")
    public void user_clicks_on_continue_tab() {
        click(userRegistration.submitBtn);
    }
}
