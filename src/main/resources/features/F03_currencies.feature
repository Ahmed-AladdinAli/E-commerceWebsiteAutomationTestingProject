@smoke
Feature: the user will change the currency throughout the page using
  the currency dropdown list
  Scenario: the user could change the currency through out the page using
    the currency dropdown list

    When user is selecting Euro currency from the dropdown list on the top left of home page
    Then the 4 products in the home page will show Euro symbol
