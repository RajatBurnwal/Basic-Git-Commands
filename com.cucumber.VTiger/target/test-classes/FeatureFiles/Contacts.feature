Feature: Test Contacts module

  Background: 
    Given User launches the browser and access the application
    When User enters valid username and password
    And clicks on Login button
    Then Home Page should be displayed

  @Smoke
  Scenario: Verify user is able to click on contacts module link
    When User clicks on Contacts option
    And Performs sign out operation
    Then login page should be displayed
    And closes the browser

  @Sanity
  Scenario: Verify user is able to click on Create New Contacts Icon
    When User clicks on Contacts option
    When User clicks on Create New Contacts Icon
    Then Creating New Contacts page should be displayed
