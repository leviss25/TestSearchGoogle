Feature: Test search Automatización in Google page

Scenario: As a user I enter a search criteria in Google
    Given I am on the Google search page
    When I enter Automatizacion in search page
    And Click on the search button
    Then The results match the criteria
    When Click on the Wikipedia link
    Then Verify year of the first process
    And I do screenshot