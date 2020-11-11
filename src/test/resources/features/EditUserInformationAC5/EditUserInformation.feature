@smoke
Feature: As a librarian I should be able to edit user information

  @librarian @edit_user_information
  Scenario: Edit user information
    Given user is on the login page
    When user logs in as a "librarian"
    Then user clicks on users button
    Then user clicks on edit user button
    When user edit user information
    When  clicks on save changes button
    Then user should see new information on the page


