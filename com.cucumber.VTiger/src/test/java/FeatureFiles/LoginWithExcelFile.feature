Feature: Test login feature with Excel file

@Regression
Scenario: Verify user is able to login in the application
Given user lunches the browser and access the application
When user passes valid credentials from "TestData.xlsx"
And clicking on Login button
Then home page has to be displayed