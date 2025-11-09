Feature: Add employee

  Background:
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see dashboard page
    When admin click on PIM option
    And admin click on Add employee option

  @sprint2 @smoke @regression @maggie
  Scenario: Adding the employee with first and last name
      ## Given user is able to access HRMS application
      ## When user enters valid username and password
      ## And user clicks on login button
      ## Then user is able to see dashboard page
      ## When admin click on PIM option
      ##And admin click on Add employee option
    And admin enters firstname and last name
    And admin clicks on save button
    Then admin is able to see employee has been added successfully

  Scenario: Adding the employee with firstname and middle name and lastname
      ## Given user is able to access HRMS application
      ##When user enters valid username and password
      ##And user clicks on login button
      ##Then user is able to see dashboard page
      ## When admin click on PIM option
      ##  And admin click on Add employee option
    And admin enters firstname and middle name and last name
    And admin clicks on save button
    Then admin is able to see employee has been added successfully


    @params
  Scenario: Adding employee with parameters
    And user enters "Johny" and "Jacob"
    And admin clicks on save button
    Then admin is able to see employee has been added successfully

      @dataTable
  Scenario: Adding multiple employees using data table
    When user adds multiple employees using data table and saves them
            | FirstName | MiddleName | LastName |
            | John      | JB         | Sally    |
            | Merry     | JB         | Wilson   |
            | Katty     | JB         | Perrier  |

