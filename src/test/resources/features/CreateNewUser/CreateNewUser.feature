@Smoke
Feature: As a librarian I want to create new users

  Background: common steps
    Given user is on the login page
    When user logs in as a "librarian"
    Then user clicks on users button
    Then user clicks on add user button


  @creating_new_users
  Scenario: Creating a new student user account
    When user adds new user information as "student" type
    And user clicks on save changes button
    Then user should see new user top of the list

  @creating_new_users
  Scenario: Creating a new student user account
    When user adds new user information as "librarian" type
    And user clicks on save changes button
    Then user should see new user top of the list

