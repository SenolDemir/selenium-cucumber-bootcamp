@smoke
Feature: PIM Page Functions

  Background:  login to app
    Given User login to application with valid credentials


  Scenario: Authorized user should add a new employee
    Given User open the "PIM" page
    And user click to add employee page
    When User enter employee information
    Then new employee should be added to list

  @pim
  Scenario Outline: Authorized user should add multiple new employee
    Given User open the "PIM" page
    And user click to add employee page
    When User enter employee informations as "<firstname>", "<middlename>", "<lastname>"
    Then new employee should be added to list

    Examples:
      | firstname | middlename | lastname    |
      | Stephon   |            | Howe        |
      | Fausto    | Van        | Rogahn      |
      | Margaret  | Vidal      | Waters      |
      | Benjamin  | Luiz       | Watsica     |
      | Lew       |            | Cruickshank |