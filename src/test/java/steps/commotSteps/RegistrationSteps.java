package steps.commotSteps;

import common.ConstructorClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class RegistrationSteps extends ConstructorClass {
    @When("I select a gender")
    public void iSelectAGender() {
        registrationPage.checkGender();
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        registrationPage.enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        registrationPage.enterLastName(lastName);
    }

    @And("I enter registration email {string}")
    public void iEnterRegistrationEmail(String email) {
        registrationPage.enterEmail(email + generalHelper.generateEmail());
    }

    @And("I enter registration password {string}")
    public void iEnterRegistrationPassword(String password) {
        registrationPage.enterPassword(password);
    }
}
