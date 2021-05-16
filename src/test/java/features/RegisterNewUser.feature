#@smoke
Feature: Registration of new user

  Scenario: Register new user

    Given I open the page "MediaMarkt"
    Then I see Cookie Popup
    When I click on button "Alle zulassen"
    Then I don't see Cookie Popup
    When I click on Mein Konto menu bar
    Then I see My Account Dropdown
    When I click on button "Registrieren"
    Then I see heading with text "Neuer Kunde?"
    When I select a gender

    #TODO