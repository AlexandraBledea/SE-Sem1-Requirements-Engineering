package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsListApplications {
    @Given("the user is logged in with a corporate account")
    public void the_user_is_logged_in_with_a_corporate_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is logged with a corporate account");
    }
    @Given("they are on the corporate index page")
    public void they_are_on_the_corporate_index_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on corporate index page");
    }
    @When("the user clicks the view applications button")
    public void the_user_clicks_the_view_applications_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User clicked view applications");
    }
    @Then("the user will see all of the applications for all internships for their company")
    public void the_user_will_see_all_of_the_applications_for_all_internships_for_their_company() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User can see all applications");
    }
}
