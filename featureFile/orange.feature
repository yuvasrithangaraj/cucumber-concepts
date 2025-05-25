Feature: checking orangehrm login functionality
Scenario: Logging in
Given user is on login page
When user enters username and password
And user clicks login button
Then Login is successful