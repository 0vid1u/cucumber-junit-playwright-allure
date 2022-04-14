@smoke
Feature: Is it Thursday yet?
  Everybody wants to know when it's Thursday

  Scenario: Sunday isn't Thursday
    Given today is Sunday
    When I ask whether it's Thursday yet
    Then I should be told "Nope"