@smoke
  Feature: user can follow the company on different websites

    Scenario: user is clicking on facebook button and directed to facebook page of the company

      When user is clicking on facebook icon
      Then user is directed to company facebook page

    Scenario: user is clicking on twitter button and directed to twitter page of the company

      When user is clicking on twitter icon
      Then user is directed to company twitter page

    Scenario: user is clicking on rrs button and directed to rss page of the company

      When user is clicking on rss icon
      Then user is directed to company rss page

    Scenario: user is clicking on youtube button and directed to youtube page of the company

      When user is clicking on youtube icon
      Then user is directed to company youtube page