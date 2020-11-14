@smoke
Feature: As a librarian I should be able to edit user information
  Background: common steps
    Given user is on the login page
    And user logs in as a "librarian"
    Then user clicks on users button



  @librarian @edit_user_information
  Scenario: Edit user information
    Then user clicks on edit user button
    When user edit user information
    When  clicks on save changes button
    Then user should see the 'the user updated' message


