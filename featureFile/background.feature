
@BackgroundExample
Feature: To explain the usage of background

  Background: Student completed school education
    Given Student finished high school
    Given Student finished higher secondary

  Scenario: To study medicine
    Given Student applied for the medical course
    When Student cleared the entrace exam
    Then student is eligible to join medical college

  Scenario: To study engineering
    Given Student applied for the engineering course
    When Student should have cut off
    Then student is eligible to join engineering college
