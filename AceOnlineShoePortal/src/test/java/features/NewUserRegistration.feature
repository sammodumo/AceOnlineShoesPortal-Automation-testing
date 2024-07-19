Feature: New User Registration view

  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigates to the Login page in Registration
    When User clicks on new Registration button
    And User fills out the registration form with valid details
    And User submits the registration form
    Then User should be registered successfully