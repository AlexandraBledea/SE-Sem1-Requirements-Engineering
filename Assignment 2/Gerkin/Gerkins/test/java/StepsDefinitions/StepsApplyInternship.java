package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsApplyInternship {
    @Given("the user is logged in with a student account")
    public void the_user_is_logged_in_with_a_student_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is logged with a student account");
    }
    @Given("the user is on the list announcements page")
    public void the_user_is_on_the_list_announcements_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on the list announcements page");
    }
    @When("the user clicks the apply button")
    public void the_user_clicks_the_apply_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked apply button");
    }
    @When("the user fills in all required information")
    public void the_user_fills_in_all_required_information() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User entered all required information");
    }
    @When("the user clicks the finish application button")
    public void the_user_clicks_the_finish_application_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicks finish application button");
    }
    @Then("the user's application is saved")
    public void the_user_s_application_is_saved() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User application saved");
    }
    @Then("the user is sent back to the list announcements")
    public void the_user_is_sent_back_to_the_list_announcements() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User goes back to list announcements page");
    }
    @When("the user fills in the required information incorrectly")
    public void theUserFillsInTheRequiredInformationIncorrectly() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User fills information incorrectly");
    }
}
