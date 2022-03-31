Feature: validate amazon application for DDT using excel

Background: Launch and invoke the browser
    Given the browser is invoked
    Then the url should be launched

Scenario Outline: Validate search item feature in amazon application
    Given the user is on amazon home page
    Then select category and item name from the sheetname "<sheetName>" and rowNum <rowNum>
    When Magnifier button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

    Examples: 
      |sheetName|rowNum|
      |Sheet1|0|
      |Sheet1|1|
      |Sheet1|2|
      |Sheet1|3|
      |Sheet1|4|
      |Sheet1|5|      