package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage extends BasePage {
    private static RegistrationPage registrationPage = null;

    public static RegistrationPage getInstance() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    private final ElementsCollection inputs = $$x("//input[@type='radio']/parent::label");
    private final SelenideElement firstNameInput = $x("//input[@id='firstName']");
    private final SelenideElement lastNameInput = $x("//input[@id='lastName']");
    private final SelenideElement emailField = $x("//input[@id='email']");
    private final SelenideElement passwordField = $x("//input[@id='password']");

    public void checkGender() {
        for (SelenideElement input : inputs) {
            if (!input.isSelected()) {
                input.click();
                break;
            }
        }
    }

    public RegistrationPage enterFirstName(String firstName) {
        enterText(firstNameInput, firstName);
        return this;
    }

    public RegistrationPage enterLastName(String lastName) {
        enterText(lastNameInput, lastName);
        return this;
    }

    public RegistrationPage enterEmail(String email) {
        enterText(emailField, email);
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        enterText(passwordField, password);
        return this;
    }
}
