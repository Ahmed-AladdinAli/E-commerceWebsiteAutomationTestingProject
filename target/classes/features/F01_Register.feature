@smoke
Feature: F1_Register| users could register with new accounts
  #Test Scenario no.1
  Scenario:  Guest user could register with new accounts

  Given user is navigating to register page
  When user is selecting  gender type
   And user is entering firstName "automation" and lastName "tester"
   And user enter date of birth
   And user enter email "test@example.com" field
   And user enter company name "MicroSoft"
   And user fills password fields "P@sswOrd" and "P@sswOrd"
   And user clicks on register button
  #Expected Result
  Then success message is displayed
    And the color is as specified




