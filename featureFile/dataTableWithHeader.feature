@DataDriven
Feature: Data Table with Header
Scenario: cat Logging in
Given cat is on the login page
When cat enter the below credentials
|username|password|
|admin   |admin123|
And cat click on the login button



# Data Driven Testing (sending data via Feature File)
# 1. Sending values directly and receiving it via regular expression
# 2. Data Tables without Header
# 3. Data Tables with header
# 4. Using Data Tables and Examples
# |username|password|
# |admin   |admin123|
