@sort_users

Feature: As a librarian I should be able to sort the user by "User Group" or "Status"
Background: common steps
  Given user is on the login page
  And user logs in as a "librarian"
  Then user clicks on users button

  Scenario: Librarian is able to sort the user by "Group"
    And user navigates to "Group" and clicks on it
    Then user verifies the Group is sorted


#  Scenario: Librarian is able to sort the user by "Group" or "Status"
 #   And user navigates to "Status"
  #  Then user verifies the Status is sorted


