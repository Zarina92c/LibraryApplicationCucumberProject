@sort_users

Feature: As a librarian I should be able to sort the user by "User Group" or "Status"
Background: CommonSteps
  Scenario: Librarian is able to sort the user by "Group"
    Given user is on the login page
    And user logs in as a "librarian"
    And navigates to "Users" and clicks on it
    And user navigates to "Group" and clicks on it
    Then user verifies the Gorup is sorted


  Scenario: Librarian is able to sort the user by "Group" or "Status"
    Given user is on the login page
    And user logs in as a "librarian"
    And navigates to "Users" and clicks on it
    And user navigates to "Status"
    Then user verifies the Status is sorted

