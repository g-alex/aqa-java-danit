Feature: Home Page functionality verification

  Scenario: Verify search field works correctly
    Given User opens Home Page
    When User enters "iPhone" word into search field on Home Page and press enter
    Then Title contains "iPhone" search word on Search Result Page

  Scenario: Verify main catalog menu appears after clicking on catalog button
    Given User opens Home Page
    When User clicks on main catalog button on Home Page
    Then Verify main catalog menu appears on Home Page

  Scenario: Verify dropdown works correctly
    Given User opens Home Page
    When User enters "Samsung" word into search field on Home Page
    Then  Dropdown contains "Samsung" search word in list

  Scenario: Verify change city works correctly
    Given User opens Home Page
    When User clicks on city button in header
    And User enters "Одеса" into city search field
    And User clicks on first city in dropdown
    Then Verify city name is "Одеса" in header

