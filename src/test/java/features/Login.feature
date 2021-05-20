@smoke
Feature: Login

  Scenario: Check login functionality

    Given I open the page "MediaMarkt"
    Then I see Cookie Popup
    When I click on button "Alle zulassen"
    Then I don't see Cookie Popup
    When I click on Mein Konto menu bar
    Then I see My Account Dropdown
    When I click on button "Anmelden"
    Then I see heading with text "Bereits Kunde?"
    When I enter "email" and "password"
    When I click on button "Anmelden"
    When I click on Mein Konto menu bar
    Then I see My Account Dropdown
    When I click on link "Abmelden"
    When I click on Mein Konto menu bar
    Then I see button "Anmelden"