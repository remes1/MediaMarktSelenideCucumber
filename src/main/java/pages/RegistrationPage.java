package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class RegistrationPage extends BasePage {
    private static RegistrationPage registrationPage = null;

    public static RegistrationPage getInstance() {
        if (registrationPage == null) {
            registrationPage = new RegistrationPage();
        }
        return registrationPage;
    }

    private final ElementsCollection inputs = $$x("//input[@type='radio']/parent::label");

    public void checkGender() {
        for (SelenideElement input : inputs) {
            if (!input.isSelected()) {
                input.click();
                break;
            }
        }
    }
}
