Feature: View internship application

  Scenario: Client view specific application
    Given the user is logged in with a corporate account
    And they are on the list applications page
    When the user clicks on an application
    Then they will see all relevant information for that application