@Smoke
Feature: As a librarian I want to create new users


  @librarian @creating_new_users
  Scenario: Creating a new student user account
    Given user is on the login page
    When user logs in as a "librarian"
    Then user clicks on users button
    Then user clicks on add user button
    When user adds new user information as "student" type
    And user clicks on save changes button
    Then user should see new user top of the list

  @librarian
  Scenario: Creating a new student user account
    Given user is on the login page
    When user logs in as a "librarian"
    Then user clicks on users button
    Then user clicks on add user button
    When user adds new user information as "librarian" type
    And user clicks on save changes button
    Then user should see new user top of the list


  @librarian
  Scenario: Managing records per page
  Given user is on the login page
  When user logs in as a "librarian"
  Then user clicks on users button
  When chooses the number from show records dropdown
  Then user should see the number of records on the page


   # @records_per_page
   # Given user is on the login page
   # When user clicks on show records buton
    #Then he should be able to pick the number
    #And then he should see records on the page

