package steps;

import common.ConstructorClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends ConstructorClass {
    @Then("I see My Account Dropdown")
    public void iSeeMyAccountDropdown() {
        homePage.myAccountDropdownIsVisible();
    }

    @When("I click on Mein Konto menu bar")
    public void iClickOnMeinKontoMenuBar() {
        homePage.clickOnMyAccountButton();
    }

    @When("I click on Mein Markt menu bar")
    public void iClickOnMeinMarktMenuBar() {
        homePage.clickOnMyMarketButton();
    }

    @Then("I see heading with text {string}")
    public void iSeeHeadingWithText(String headingText) {
        basePage.headingWithTextVisible(headingText);
    }
}
