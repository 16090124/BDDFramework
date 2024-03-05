Feature: Validate login feature for FB application

  #1
  Scenario: validate the login with valid credentials
    Given user is on the login page
    When user enter "validTest" username
    And user enter "correctPassword" password
    And user click on login button
    Then user should be logged in successfully

  #2
  Scenario: validate the login with invalid credentials
    Given user is on the login page
    When user enter "inValidTest" username
    And user enter "wrongPassword" password
    And user click on login button
    Then user should not be allowed to log in
