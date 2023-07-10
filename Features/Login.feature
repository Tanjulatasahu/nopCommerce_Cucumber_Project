Feature: Login

  Background: Below are common steps for every scenario
    Given Launch chrome browser
    When Enter the URL "http://admin-demo.nopcommerce.com/login"


  @sanity
  Scenario: Login with valid credentials
    Then Enter the Email as "admin@yourstore.com" and Password as "admin"
    And Click on login button
    Then Page title should be "Dashboard / nopCommerce administration"
    Then Click on logout button
    Then Page title should be "Your store. Login"
    And Close the browser

    @regression
    Scenario Outline: Check the Login functionality with multiple sets of data
      Then Enter the Email as "<email>" and Password as "<password>"
      And Click on login button
      Then Page title should be "Dashboard / nopCommerce administration"
      Then Click on logout button
      Then Page title should be "Your store. Login"
      And Close the browser

     Examples:
       | email | password |
      | admin@yourstore.com | admin |
      | admin1@yourstore.com | admin123 |
