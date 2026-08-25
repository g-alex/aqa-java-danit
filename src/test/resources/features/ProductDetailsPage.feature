Feature: Product Details Page functionality verification

  Scenario: Verify user can be navigated to the correct product details page
    Given User opens Home Page
    When User enters "Xbox" word into search field on Home Page and press enter
    And User remember 8 product name on Search Result Page
    And User clicks on 8 product picture on Search Result Page
    Then User verify product title is correct on Product Details Page