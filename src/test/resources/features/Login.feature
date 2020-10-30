@log_in @smoke
Feature: As a user I want to be able to login under different role


  @librarian
  Scenario: Login as a librarian
  Given user is on the login page
    When user logs in as a "librarian"
    Then user should see homepage name Dashboard


  @student1
  Scenario: Login as a "student1"
    Given user is on the login page
    When user logs in as a "student1"
    Then user should see homepage name Books


   # @records_per_page
   # Given user is on the login page
   # When user clicks on show records buton
    #Then he should be able to pick the number
    #And then he should see records on the page

