Feature: List internship announcements

  Scenario: Client views all applications
    Given the user is logged in with a student account
    And they are on the student index page
    When the user clicks the view announcements button
    Then the user will see all of the announcements