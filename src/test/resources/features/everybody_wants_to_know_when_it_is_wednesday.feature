@smoke
Feature: Is it Wednesday yet?
  Everybody wants to know when it's Wednesday

  Scenario: Sunday isn't Wednesday
    Given today is Sunday
    When I ask whether it's Wednesday yet
    Then I should be told "Nope"