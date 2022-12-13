@smoke
Feature: users could use login functionality to use their accounts.

  #Positive Scenario
  Scenario: user could login with valid email and password.

    Given user is navigating to login page
    When user logging with valid data "test@example.com" and "P@sswOrd"
    And user is pressing on login button
    Then user is logging to system successfully



  #negative Scenario
  Scenario: user could login with invalid email and password

    Given user is navigating to login page for TC2 negative scenario
    When user logging with invalid data "wrong@example.com" and "P@sswOrd"
    And user is pressing on login button for TC2 negative scenario
    Then user could not login to the system

