package steps.commotSteps;

import common.ConstructorClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.open;

public class CommonSteps extends ConstructorClass {
    @Given("I open the page {string}")
    public void iOpenThePage(String application) {
        open(confighelper.GetConfigValue(application));
        utils.maximizeBrowser();
    }

    @Then("I see Cookie Popup")
    public void iSeeCookiePopup() {
        basePage.popUpIsVisible();
    }

    @When("I click on button {string}")
    public void iClickOnButton(String buttonText) {
        basePage.clickButtonWithText(buttonText);
    }

    @Then("I don't see Cookie Popup")
    public void iDonTSeeCookiePopup() {
        basePage.popUpIsNotVisible();
    }

    @And("I wait {int} seconds")
    public void iWaitSeconds(int sec) throws InterruptedException {
        utils.sleep(sec);
    }

    @When("I click on link {string}")
    public void iClickOnLink(String linkText) {
        basePage.clickOnLinkWithText(linkText);
    }

    @Then("I see button {string}")
    public void iSeeButton(String buttonText) {
        Assertions.assertTrue(basePage.buttonWithTextIsVisible(buttonText));
    }
}
