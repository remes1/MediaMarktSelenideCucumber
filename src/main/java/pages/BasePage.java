package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage{
    private static BasePage basePage = null;

    public static BasePage getInstance() {
        if (basePage == null) {
            basePage = new BasePage();
        }
        return basePage;
    }

    private final SelenideElement cookiePopUp = $x("//div[@id='privacy-layer__wrapper']//form");

    public void popUpIsVisible() {
        cookiePopUp.shouldBe(visible);
    }

    public void popUpIsNotVisible() {
        cookiePopUp.shouldNotBe(visible);
    }

    protected void clickOnElement(SelenideElement element) {
        element.shouldBe(visible).click();
    }

    protected void elementIsVisible(SelenideElement element) {
        element.shouldBe(visible);
    }

    public void headingWithTextVisible(String text) {
        $x("//*[self::h1 or self::h2 or self::h3 or self::h4][contains(text(),'" + text + "')]").shouldBe(visible);
    }

    public void waitUntilButtonWithTextDisappear(String buttonText){
        $x("//button[text()= '" + buttonText + "']").should(Condition.disappear);
    }

    public void clickButtonWithText(String buttonText) {
        for (int i = 1; i < 3; i++) {
            if ($x("(//button[text()= '" + buttonText + "'])[" + i + "]").is(visible))
                $x("(//button[text()= '" + buttonText + "'])[" + i + "]").click();
        }
    }

    public boolean buttonWithTextIsVisible(String buttonText) {
        if ($x("(//button[text()= '" + buttonText + "'])[" + 1 + "]").is(visible))
            return true;
        else
            return $x("(//button[text()= '" + buttonText + "'])[" + 2 + "]").is(visible);
    }

    protected void enterText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).val(text);
    }

    public void clickOnLinkWithText(String linkText) {
        for (int i = 1; i < 3; i++) {
            if ($x("(//span[contains(text(), '" + linkText + "')])[" + i + "]/parent::a").is(visible))
                $x("(//span[contains(text(), '" + linkText + "')])[" + i + "]/parent::a").click();
        }
    }
}
