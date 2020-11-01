@Smoke
Feature: As a librarian I want to create new users

  Scenario: Creating new student user account
    Given user is on the login page
    When user logs in as a "librarian"
    Then  user clicks on  "users" button
    Then user clicks on add user button
    When user adds new user information as student type
    And user clicks on save changes button
    Then user should see new user on top of the list



