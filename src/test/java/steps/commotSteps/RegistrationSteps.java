package steps.commotSteps;

import common.ConstructorClass;
import io.cucumber.java.en.When;

public class RegistrationSteps extends ConstructorClass {
    @When("I select a gender")
    public void iSelectAGender() {
        registrationPage.checkGender();
    }
}
