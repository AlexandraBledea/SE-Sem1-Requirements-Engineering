package StepsDefinitions;

import io.cucumber.java.en.*;

public class StepsViewApplication {
    @Given("they are on the list applications page")
    public void they_are_on_the_list_applications_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client is on the list applications page");
    }
    @When("the user clicks on an application")
    public void the_user_clicks_on_an_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client clicked on an application");
    }
    @Then("they will see all relevant information for that application")
    public void they_will_see_all_relevant_information_for_that_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Client sees all relevant information for that application");
    }
}
