@Functionality
Feature: Test login feature with Scenario Outline

Scenario Outline: Verify user is able to login with valid credentials
Given User launch the browsers and opens the application
When user enters valid usernames "<username>" and password "<password>"
And clicks on Login buttons
Then home page should be displayed

Examples:
|username|password|
|admin|admin|
|admin123|admin123|