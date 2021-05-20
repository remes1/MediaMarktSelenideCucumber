#@smoke
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



    Given AnyDesk is running on frontend and remote machines with Windows 8/10, macOS or Linux
    When frontend user enter remote address and click "Connect"
    Then frontend user receives authentication popup to enter password (if the password was set up) and remote user receives session invitation window
    When frontend user enters password and clicks "Ok" button or remote user accepts session invitation window by pressing "Accept" button
    Then connection is established and session is starting
    When remote user disables "Privacy mode" in the session invitation window
    Then privacy mode is disabled
    When frontend user clicks on "Permissions"
    Then checkbox "Enable privacy mode" is disabled
    When frontend user checks the checkbox "Enable privacy mode" under "Permissions"
    Then the remote screen is blacked out, user inputs are blocked and sound is muted