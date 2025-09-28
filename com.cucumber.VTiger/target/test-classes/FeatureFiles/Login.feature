Feature: Test Login feature

@Smoke
Scenario: Verify user is able to login to application with valid credentials
Given User launches the browser
And Access the application
When User enter valid username and password
And click on Login button
Then Home page should be displayed
And close the browser