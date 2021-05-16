package steps.commotSteps;

import common.ConstructorClass;
import io.cucumber.java.en.When;

public class LoginPageSteps extends ConstructorClass {
    @When("I enter {string} and {string}")
    public void iEnterEmailAndPassword(String email, String password) {
        loginPage.enterEmailAndPassword(confighelper.GetConfigValue(email),
                generalHelper.decodeString(confighelper.GetConfigValue(password)));
    }
}
