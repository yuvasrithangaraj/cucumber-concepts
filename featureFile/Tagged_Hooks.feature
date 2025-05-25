@TaggedHooks
Feature: Test Tagged Hooks

  @First
  Scenario: This is first scenario
    Given This is first step
    When This is second step
    Then This is third step

  @Second
  Scenario: This is Second scenario
    Given This is first step
    When This is second step
    Then This is third step

  @Third
  Scenario: This is Third scenario
    Given This is first step
    When This is second step
    Then This is third step
