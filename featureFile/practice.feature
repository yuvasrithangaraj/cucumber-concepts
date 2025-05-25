@practice
Feature: checking login functionality

  Scenario Outline: checking login functionality with valid and invalid datas
    Given n is on the login page
    When n enters the "<username>" and "<password>"
    Then n logging in or not

    Examples: 
      | username | password |
      | admin    | Admin123 |
      | adin     | Admin123 |
      | admin    | Adm23    |
      | adm      | Ad23     |
