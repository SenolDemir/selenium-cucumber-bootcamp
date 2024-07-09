
Feature: Login To Page

  Scenario: Users with valid credentials should login to application
    Given navigate to login page
    When the user enter valid "username" and "password"
    Then user should login to application


