@ddt
Feature: Data Driven Test

# Parameterization without Example Keyword
  Scenario: Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

#   Parameterization without Example Keyword
#   Alltaki seneryoda yine example kullanmadan data aliniyor.
#   Bu kez map ile alinip birinci sutunlar key olarak kullaniliyor
  Scenario: login with valid credentials
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |

#   Using Scenario Outline:
#   Parameterization with Example Keyword
  Scenario Outline: Login with different type of authorizations
    Given the user is on the login page
    When the user enter valid "<username>" and "<password>" as "<position>"
    Then the user should reach dashboard

    Examples:
      | username    | password  | position    |
      | Lionelmessi | messi123  | forwet      |
      | rubendiaz   | diaz123   | stopper     |
      | rodgi       | rodri123  | middlefield |
      | sommer      | sommer123 | goalkeeper  |











