Feature: LoggedIn User view

  Scenario: Validate user is able to view after logging in
    Given User navigates to the Login page
    When User successfully enters the log in credentials
    Then User should be able to view product category page