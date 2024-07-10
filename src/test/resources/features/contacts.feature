@contacts
Feature: ddt with contacts


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



#
#
#  Scenario Outline: login as a given user <user>
#    Given the user is on the login page
#    When the user logs in using following credentials
#      | username  | <user>      |
#      | password  | UserUser123 |
#      | firstname | <firstName> |
#      | lastname  | <lastName>  |
#    Then the user should be able to login
#
#    Examples:
#      | user           | firstName | lastName  |
#      | user10         | Brenden   | Schneider |
#      | storemanager85 | Stephan   | Haley     |