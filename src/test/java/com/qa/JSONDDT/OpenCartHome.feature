#Author:Muskan Jaiswal
@dataFile:src/test/java/com/qa/testdata/testdata.json
Feature: Validate the opencart website

  Background: Launch and invoke the browser
    Given open the browser
    Then the url should be launched

  @SearchCriteria
  Scenario: Validate search criteria is having a search term
    Given the user is on opencart home page
    And type mobile in search text field
    When magnifier button is clicked
    Then navigates to search page
    Then check if mobile is written in search criteria text field
    Then select the Phones & PDAs as category
    And click the checkbox to select of search in subcategories
    Then click the checkbox of search in product description
    When search button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

  @MultipleSearchItem
  Scenario Outline: Validate multiple inputs for search item feature without logging in opencart application
    Given the user is on opencart home page
    When magnifier button is clicked
    Then navigates to search page
    Then type "<item name>" as search criteria
    Then select the "<category>" as category
    Then check if search in subcategory checkbox is enabled for selection
    And click the checkbox to select of search in subcategories
    Then click the checkbox of search in product description
    When search button is clicked
    Then the items related to search term should be fetched
    Then the driver window should be closed

    Examples: 
      | item name     | category      |
      | mobile        | Phones & PDAs |
      | Nikon D300    | Cameras       |
      | Samsun Galaxy | Tablets       |

  @PositiveTest
  Scenario: Validate successful Register Account with valid entries
    Given the user is on opencart home page
    And check if MyAccount is displayed on Homepage
    When MyAccount Link is clicked
    Then check if dropdown has register and login as option
    When Register option is clicked
    Then navigates to Register Account page
    Then type First Name
    Then type Last Name
    Then type E-Mail
    And type Telephone
    Then type password
    And again type confirm password
    Then check if No is defaulty selected
    And click the checkbox of I have read and agreed to the privacy policy
    When continue button is clicked
    Then navigates to My Account page
    And Mesaage displayed as Your account has been created
    Then the driver window should be closed

  @SmokeTest
  Scenario Outline: Validate successful login with valid entries using excel sheet
    Given the user is on opencart home page
    And check if MyAccount is displayed on Homepage
    When MyAccount Link is clicked
    Then check if dropdown has register and login as option
    When login option is clicked
    Then navigates to login page
    Then type "<sheetName>" as email address and type <rowNum> as password
    When login button is clicked
    Then navigates to myAccounts page
    When MyAccount Link is clicked
    Then Check if dropdown has Logout option
    When Logout option is clicked
    Then navigates to Account Logout page
    And Message displayed as Account Logout
    Then the driver window should be closed

    Examples: 
      | sheetName | rowNum |
      | Sheet1    |      0 |
      | Sheet1    |      1 |

  @ReviewPositiveTest
  Scenario Outline: Validate successful review for any item
    Given the user is on opencart home page
    Then scrolldown to the image
    When image is clicked
    Then scrolldown to the review
    When click on review
    Then type "<name>" as your name
    Then type "<review>" as your review
    Then give <rating> as star rating
    When continue btn is clicked
    Then the driver window should be closed

    Examples: 
      | name    | review                                                                             | rating |
      | Avanya  | Product is soo good and I really wanted to buy it for my cousin... in her birthday |      5 |
      | Sneha   | Not soo good, worst Experience...:(                                                |      1 |
      | Akansha | Okay Okay, like you can try it once buy features can be enhanced more...;)         |      3 |

  @ReviewNegativeTest
  Scenario Outline: Validate review for any item with invalid inputs
    Given the user is on opencart home page
    Then scrolldown to the image
    When image is clicked
    Then scrolldown to the review
    When click on review
    Then type "<name>" as your name
    Then type "<review>" as your review
    Then give <rating> as star rating
    When continue btn is clicked for Negative Review
    Then the driver window should be closed

    Examples: 
      | name   | review                                                                             | rating |
      | Avanya | Product is soo good and I really wanted to buy it for my cousin... in her birthday |      0 |
      | Sneha  |                                                                                    |      1 |
      |        | Okay Okay, like you can try it once buy features can be enhanced more...;)         |      3 |
      |        |                                                                                    |      0 |

     @JSONTest 
    Scenario Outline: Validate successful login with valid entries by taking input from json file
    Given the user is on opencart home page
    And check if MyAccount is displayed on Homepage
    When MyAccount Link is clicked
    Then check if dropdown has register and login as option
    When login option is clicked
    Then navigates to login page
    Then type <email> as email address and type <pwd> as password
    When login button is clicked
    Then navigates to myAccounts page
    When MyAccount Link is clicked
    Then Check if dropdown has Logout option
    When Logout option is clicked
    Then navigates to Account Logout page
    And Message displayed as Account Logout
    Then the driver window should be closed

  
     
       @JSONMULTTest 
    Scenario Outline: Validate successful login with valid entries by taking array input from json file
    Given the user is on opencart home page
    And check if MyAccount is displayed on Homepage
    When MyAccount Link is clicked
    Then check if dropdown has register and login as option
    When login option is clicked
    Then navigates to login page
    Then type <email> as email address and type <pwd> as password
    When login button is clicked
    Then navigates to myAccounts page
    When MyAccount Link is clicked
    Then Check if dropdown has Logout option
    When Logout option is clicked
    Then navigates to Account Logout page
    And Message displayed as Account Logout
    Then the driver window should be closed
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      