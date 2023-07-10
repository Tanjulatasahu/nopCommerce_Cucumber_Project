Feature: Customers

  Scenario: Add a new customer
    Given Launch chrome browser
    When Enter the URL "http://admin-demo.nopcommerce.com/login"
    Then Enter the Email as "admin@yourstore.com" and Password as "admin"
    And Click on login button
    Then User can view Dashborad page
    Then Click on customers Menu
    Then Click on customers Menu Item
    And Click on Add new button
    Then User can view Add new customer page
    Then Enter customer info
    Then Click on Save button
    Then Confirmation message should be displayed "The new customer has been added successfully."
    And Close the browser