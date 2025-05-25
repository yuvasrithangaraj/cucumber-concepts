@login
Feature: Login with data
Scenario: user Logging in
Given user is on the login page
When user enters username as "Admin" and password as "admin123"
And user clicks on the login button
Then user logged in successfully