Feature: As a librarian I should be able to sort users

  @librarian @sorting_by_number
  Scenario: Managing records per page
    Given user is on the login page
    When user logs in as a "librarian"
    Then user clicks on users button
    When chooses the number from show records dropdown
    Then user should see the number of records on the page
