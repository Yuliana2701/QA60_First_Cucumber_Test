Feature: HomePage
@navigate
  Scenario: Verify HomePage title is displayed

    Given user launches Chrome browser
    When user opens ilcarro HomePage
    Then user verifies HomePage title
    And user quits browser