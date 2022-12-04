Feature: Facebook login functionality
  Scenario: Facebook login
    Given user is navigated to Facebook login page
    When user enters valid username and password
    And user clicks on Facebook login button
    Then  user can successfully logged in Facebook Homepage