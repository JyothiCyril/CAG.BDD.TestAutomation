Feature: Validate the amazon web site

  Background: Launch and invoke the browser
    Given the browser is invoked
    Then the url should be launched

  @SmokeTest @End2End @RegressionalTest
  Scenario: Validate search item feature in amazon application
    Given the user is on amazon home page
    Then select the Books as category
    And type Da Vinci code in search text field
    When Magnifier button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

  @SmokeTest @RegressionalTest
  Scenario: Validate new user creation feature in amazon application
    Given the user is on amazon home page
    When the user does mouse over on AccountsandList element
    Then click start here link
    When the user is landed on registration page
    Then type the "King Blake" as customer id
    Then the driver window should be closed

  @SmokeTest
  Scenario: Validate footer links on amazon web page
    Given the user is on amazon home page
    Then fetch all the links present on the footer page
    Then the driver window should be closed

  @End2End @RegressionalTest
  Scenario: Validate search item feature for different books in amazon application
    Given the user is on amazon home page
    Then select the Books as category
    And type item name in search text field
      | Da vinci code   |
      | E M Forster     |
      | Charles Dickens |
    When Magnifier button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

  @End2End
  Scenario Outline: Validate search item feature in amazon application
    Given the user is on amazon home page
    Then select the "<Category>" as category
    And type "<ItemName>" in search text field
    When Magnifier button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

    Examples: 
      | Category    | ItemName         |
      | Books       | Da vinci code    |
      | Electronics | Mobile phones    |
      | Appliances  | Washing machines |
