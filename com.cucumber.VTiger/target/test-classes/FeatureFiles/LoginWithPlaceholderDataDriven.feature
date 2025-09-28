Feature: Test Login feature with data driven using placeholder

@Regression @Smoke
Scenario: Verify user is able to login to application
Given User launches the browser and access the application
When user enters valid username "admin" and password "admin"
And clicks on Login button
Then Home page should be displayed