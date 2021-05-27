package hooks;

import io.cucumber.java.After;

import static com.codeborne.selenide.WebDriverRunner.*;

public class Hooks {

    @After
    public void tearDown() {
        closeWebDriver();
    }

}
