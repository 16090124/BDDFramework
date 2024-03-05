Feature: Validate Login Feature with multiple credentials

  Scenario Outline: Login feature for multiple credentials
    Given user is on the login page
    When user enters <username> and <password>
    And user click on login button
    Then user should be logged in successfully

    Examples: 
      | username | password  |
      | admin    | admin12   |
      | hr       | hr123     |
      | finance  | finance12 |
