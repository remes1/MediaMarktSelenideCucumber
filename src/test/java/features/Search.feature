@smoke
Feature: Search

  Scenario: Check search

    Given I open the page "MediaMarkt"
    Then I see Cookie Popup
    When I click on button "Alle zulassen"
    Then I don't see Cookie Popup

    #TODO