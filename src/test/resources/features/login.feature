Feature: Login
  @validData
  Scenario: Login with valid data
    Given user lunches Chrome browser
    When user opens ilcarro HomePage
    And user clicks on login link
    And user enters valid data
    And user clicks on Yalla button
    Then user verifies success message is displayed
    And user quits browser

    @wrongPassword
    Scenario Outline: Login with valid email ana wrong password

    Given user lunches Chrome browser
    When user opens ilcarro HomePage
    And user clicks on login link
    And user enters valid email and wrong password
      |email|password|
      | <email>| <password>|
    And user clicks on Yalla button
    Then user verifies error message is displayed
    And user quits browser

      Examples:
        | email |password
        | yuliana@gmail.com |Qwerty12345
        | yuliana@gmail.com |QWERTY1
        | yuliana@gmail.com |qwerty
