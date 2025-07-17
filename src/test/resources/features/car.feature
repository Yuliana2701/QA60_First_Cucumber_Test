Feature: Car Search
@searchYourCar
  Scenario: Search for a car with no available results

    Given user launches Chrome browser
    When user opens ilcarro HomePage
    And user clicks on login link
    And user enters valid data
    And user clicks on Yalla button
    And user clicks on search link
    And user types a valid city
    And user selects valid date
    And user clicks on search Yalla button
    Then user verifies not success message is displayed
    And user quits browser
