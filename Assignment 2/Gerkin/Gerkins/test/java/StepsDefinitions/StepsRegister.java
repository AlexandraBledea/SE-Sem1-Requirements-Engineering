package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsRegister {
    @Given("the user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on registration page");
    }
    @When("the user has completed all mandatory fields with correct information")
    public void the_user_has_completed_all_mandatory_fields_with_correct_information() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User completed all fields correctly");
    }
    @Then("the user data is validated successfully")
    public void the_user_data_is_validated_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User data validated successfully");
    }
    @Then("the user account is successfully created")
    public void the_user_account_is_successfully_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User account created");
    }
    @Then("the user is redirected to their student or corporate index page")
    public void the_user_is_redirected_to_their_student_corporate_index_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User redirected to index page");
    }
    @When("the user has completed at least one mandatory incorrectly \\(empty or incorrect information)")
    public void the_user_has_completed_at_least_one_mandatory_incorrectly_empty_or_incorrect_information() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User completed fields incorrectly");
    }
    @When("the user clicks the complete registration button")
    public void the_user_clicks_the_complete_registration_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked complete registration button");
    }
    @Then("the user data is validated unsuccessfully")
    public void the_user_data_is_validated_unsuccessfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User data invalid");
    }
    @Then("the user account is not created")
    public void the_user_account_is_not_created() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User not created");
    }
    @Then("the user gets an error message and remains on the page")
    public void the_user_gets_an_error_message_and_remains_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User gets error message");
    }
}
