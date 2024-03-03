package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsForgotPassword {
    @Given("the user is on the forgot password page")
    public void the_user_is_on_the_forgot_password_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on forgot password page");
    }
    @Given("the user has an account associated with their email")
    public void the_user_has_an_account_associated_with_their_email() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has account for email");
    }
    @When("the user inputs their email")
    public void the_user_inputs_their_email() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User inputs email");
    }
    @When("the user clicks the forgot password button")
    public void the_user_clicks_the_forgot_password_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicks forgot password button");
    }
    @Then("the user will get a confirmation message")
    public void the_user_will_get_a_confirmation_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User gets confirmation message");
    }
    @Then("the user will receive an email with the new randomly generated")
    public void the_user_will_receive_an_email_with_the_new_randomly_generated() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User gets new password");
    }
    @Given("the user does not have an account associated with their email")
    public void the_user_does_not_have_an_account_associated_with_their_email() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User does not have account for email");
    }
    @Then("the user will get an error message that no account is associated with this email")
    public void the_user_will_get_an_error_message_that_no_account_is_associated_with_this_email() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User gets error message");
    }
}
