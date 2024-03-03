package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsViewAnnouncement {
    @Given("they are on the list announcements page")
    public void they_are_on_the_list_announcements_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client is on the list announcements page");
    }
    @When("the user clicks on an announcement")
    public void the_user_clicks_on_an_announcement() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client clicked on an announcement");
    }
    @Then("They will see all relevant information for that announcement")
    public void they_will_see_all_relevant_information_for_that_announcement() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client sees all relevant information for that announcement");
    }
}
