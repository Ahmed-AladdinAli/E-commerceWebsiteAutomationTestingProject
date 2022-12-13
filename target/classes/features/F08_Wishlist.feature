@smoke
  Feature: user can add products to his wishList when clicking heart icon
    Scenario: user adds a product to his wishlist and receiving a success message

      Given user is navigating to register page for TC8 sc1
      And user is selecting  gender type for TC8 sc1
      And user is entering firstName "automation" and lastName "tester" for TC8 sc1
      And user enter date of birth for TC8 sc1
      And user enter email "test@example.com" field for TC8 sc1
      And user enter company name "MicroSoft" for TC8 sc1
      And user fills password fields "P@sswOrd" and "P@sswOrd" for TC8 sc1
      And user clicks on register button for TC8 sc1
      And user is navigating to home page after registration for TC8 sc1
      And user is navigating to login page for TC8 sc1
      And user logging with valid data "test@example.com" and "P@sswOrd" for TC8 sc1
      When user is clicking on heart icon
      Then a success message appears

    Scenario: user wishlist page contains the true information about his wishlist

      Given user is navigating to login page for TC8 sc2
      And user logging with valid data "test@example.com" and "P@sswOrd" for TC8 sc2
      And user is navigating to wishlist page
      When user is checking the number of items wished in the table
      Then quantity value should be larger than 0