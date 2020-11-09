@smoke @loginWithBackground
Feature: As a librarian I want to create new users

Background: User is on the login page
  Given user is on the login page

  @librarian
  Scenario: Librarian scenario login

    When user logs in as a "librarian"
   Then user should see homepage name Dashboard

    @student
  Scenario: Student scenario login
  When user logs in as a "student5"
  Then user should see homepage name Books



   # @records_per_page
   # Given user is on the login page
   # When user clicks on show records buton
    #Then he should be able to pick the number
    #And then he should see records on the page

