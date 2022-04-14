@smoke
Feature: Is it Tuesday yet?
  Everybody wants to know when it's Tuesday

  Scenario: Sunday isn't Tuesday
    Given today is Sunday
    When I ask whether it's Tuesday yet
    Then I should be told "Nope"