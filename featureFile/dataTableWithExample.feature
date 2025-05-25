@DataDriven
Feature: Data Table with Example
Scenario Outline: hy Logging in
Given hy is on the login page
When hy enter the username "<username>" and password "<password>"
And hy clicks on the login button

Examples:
|username|password|
|admin   |admin123|
|amin    |admin123|

#Scenario - is meant for a single execution with hardcoded or direct step values.
#Scenario Outline - is used for data-driven testing 
#                   with parameterized placeholders (<value>) and Examples.


# without Scenario Outline, Examples cannot be used
# Examples is strictly part of Scenario Outline, not regular Scenario