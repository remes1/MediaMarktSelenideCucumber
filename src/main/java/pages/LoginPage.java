package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage{
    private static LoginPage loginPage = null;

    public static LoginPage getInstance() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    private final SelenideElement emailField = $x("//input[@id='email']");
    private final SelenideElement passwordField = $x("//input[@id='password']");


    public void enterEmailAndPassword(String email, String password){
        enterText(emailField, email);
        enterText(passwordField, password);
    }


}
