package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsListAnnouncements {
    @Given("they are on the student index page")
    public void they_are_on_the_student_index_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client is on the student index page");
    }
    @When("the user clicks the view announcements button")
    public void the_user_clicks_the_view_announcements_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client clicked view announcements button");
    }
    @Then("the user will see all of the announcements")
    public void the_user_will_see_all_of_the_announcements() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client can see all announcements");
    }

}
