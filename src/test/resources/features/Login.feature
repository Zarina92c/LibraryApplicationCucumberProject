
Feature: As a user I want to be able to login under different role


  @log_in
  Scenario: Login as a librarian
  Given user is on the login page
    When user logs in
    Then user should see homepage


   # @records_per_page
   # Given user is on the login page
   # When user clicks on show records buton
    #Then he should be able to pick the number
    #And then he should see records on the page

