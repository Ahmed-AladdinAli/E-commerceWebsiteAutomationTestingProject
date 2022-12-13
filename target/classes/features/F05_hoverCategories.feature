@smoke
  Feature: the user should be able to hover on main categories in home page
    and select sub categories by clicking
  Scenario: the user select a main category from the home page , hover on it
    , and select one of it's subcategories by clicking on it .

    When user hover on a main category
    And user clicks on a subCategory
    Then user is navigating to the right page
