@smoke
Feature: Is it Monday yet?
  Everybody wants to know when it's Monday

  Scenario: Sunday isn't Monday
    Given today is Sunday
    When I ask whether it's Monday yet
    Then I should be told "Nope"