@smoke
Feature: the user could login using a social networking site
  Scenario Outline: user could search for items using products Name

    When user is entering the searching data as <searchingByName>
    Then the products will be shown


    Examples:
    |searchingByName|
    |book|
    |laptop|
    |nike|

  Scenario Outline: user could search for items using products serial number

    When user is entering searching data as <searchingBySerialNumber>
    Then  products will be shown
    Examples:
      |searchingBySerialNumber|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|

