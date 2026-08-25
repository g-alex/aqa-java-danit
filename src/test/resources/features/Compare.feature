Feature: Compare functionality verification

  Scenario: Verify compare page return error when add only one product
    Given User opens Home Page
    When User enters "Audi" word into search field on Home Page and press enter
    And User click on compare button on first product in list
    And User click on compare button in header menu
    And User click on category in dropdown menu in compare list
    Then Verify error text is displayed on Compare Page