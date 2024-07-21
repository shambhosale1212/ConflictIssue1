Feature: Test Orange HRM Application

  Scenario: validate Login page Functionality
    Given user is on login page
    When user enter valid credentials
    Then user click on login button

  Scenario: Validate PIM Page Functionality
    When user click on pim link
    And user click on add  button
