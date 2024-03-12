
@tag
Feature: Login feature

  @tag1
  Scenario: validating login page
    Given user opens chrome and enters url
    When user enters username
    And user enters password
    And click on login
    Then Welcome back message is displayed


