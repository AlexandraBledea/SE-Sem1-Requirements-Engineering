package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsLogin {
    // Login
    @Given("the user has a student account")
    public void the_user_has_a_student_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client has a student account");
    }
    @When("the user inputs the username and password correctly")
    public void the_user_inputs_the_username_and_password_correctly() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client inputs correct username and password");
    }
    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client clicks login button");
    }
    @Then("the user credentials are successfully checked")
    public void the_user_credentials_are_successfully_checked() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Credentials are successfully validated");
    }
    @Then("the user is redirected to the student index page")
    public void the_user_is_redirected_to_the_student_index_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client is redirected to the student index page");
    }
    @Given("the user has a company account")
    public void the_user_has_a_company_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client has a corporate account");
    }
    @Then("the user is redirected to the company index page")
    public void the_user_is_redirected_to_the_company_index_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client is redirected to the company index page");
    }
    @Given("the user inputs an incorrect set of username and password")
    public void user_inputs_an_incorrect_set_of_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client inputs incorrect username and password");
    }
    @Then("the user credentials are unsuccessfully checked")
    public void the_user_credentials_are_unsuccessfully_checked() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Credentials are not validated");
    }
    @Then("the user gets an error message")
    public void the_user_gets_an_error_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client gets an error message");
    }

}
