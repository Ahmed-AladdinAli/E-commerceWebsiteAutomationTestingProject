@smoke
Feature: the sliders on the homepage are clickable and direct user to the right page
  Scenario: user is clicking the first slider on the homePage successfully

    When user is clicking on the first slider in the homePage
    Then user is navigating to the right page sc1

  Scenario: user is clicking the second slider on the homePage successfully

    When user is clicking on the second slider in the homePage
    Then user is navigating to the right page TC6 sc2
