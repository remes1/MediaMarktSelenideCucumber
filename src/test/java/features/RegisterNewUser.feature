@smoke
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
    And I enter first name "Max"
    And I enter last name "Musterman"
    And I enter registration email "username-"
    And I enter registration password "Test123!"
    And I click on button "Jetzt registrieren"
    Then I wait until button "Jetzt registrieren" disappears