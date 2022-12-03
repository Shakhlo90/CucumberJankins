Feature: Facebook login functionality
  Scenario: Facebook login
    Given user navigated to Facebook login page
    When user sends valid username and password
    And user clicks on Facebook login button
    Then  user can successfully logged in Homepage