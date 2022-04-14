@smoke
Feature: Is it Saturday yet?
  Everybody wants to know when it's Saturday

  Scenario: Sunday isn't Saturday
    Given today is Sunday
    When I ask whether it's Saturday yet
    Then I should be told "Nope"