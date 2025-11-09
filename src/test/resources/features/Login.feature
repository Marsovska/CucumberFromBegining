Feature: Login related scenarios


  @sprint1 @smoke @regression
  Scenario: valid admin login
    ##Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see dashboard page

    @outlineScenario
    Scenario Outline: Invalid admin login
      When user enters "<username>" and "<password>" in the app
      And user clicks on login button
      Then user shall see error message
      Examples:
        | username | password |
        | Admin    | test     |
        |          |Hum@nhrm123|
        | test     |          |
        |          |          |
