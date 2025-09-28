Feature: Contacts Feature

Scenario: Verify user is able to click on Contacts menu in Home page
Given browser is launched and application is opened
When user passes username to username textfield and password to password textfield
And username clicks on Login button
Then Home pag should be displayed
When user clicks on Contacts menu
Then contacts page should be displayed