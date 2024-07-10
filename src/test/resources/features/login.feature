@login
Feature: Login To Page

  Scenario: Users with valid credentials should login to application
    Given navigate to login page
    When the user enter valid "username" and "password"
    Then user should login to application


  Scenario Outline: Users with invalid credentials should not login to app
    Given navigate to login page
    When the user enter invalid "<username>" and "<password>"

    Then the user should not login to app
    Examples:
      | username | password |
      | Admin    | Admin    |
      | admin    | admin12  |
      | admin    | admin    |
      | test     | test     |



