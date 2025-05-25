@DataDriven @DataTableWithoutHeader
Feature: Data Table without Example
Scenario: you Logging in
Given you are on the login page
When you enter the below credentials
|Admin|admin123|
And you click on the login button




# Data Driven Testing (sending data via Feature File)
# 1. Sending values directly and receiving it via regular expression
# 2. Data Tables without Header
# 3. Data Tables with header
# 4. Using Data Tables and Examples
# |Admin|admin123|