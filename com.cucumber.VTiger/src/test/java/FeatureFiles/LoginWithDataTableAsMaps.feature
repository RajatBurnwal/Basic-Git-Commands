Feature: Test login feature with DataTable as Maps

@Sanity
Scenario: Verify user is able to login in the application
Given user lunches the browser and access the application
When user pass valid credentials as below
|SNo|username|password|
|01|admin|admin|
|02|admin123|admin456|

And clicking on Login button
Then home page has to be displayed