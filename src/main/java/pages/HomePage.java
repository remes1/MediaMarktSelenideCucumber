package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage extends BasePage {
    private static HomePage basePage = null;

    public static HomePage getInstance() {
        if (basePage == null) {
            basePage = new HomePage();
        }
        return basePage;
    }

    private final SelenideElement myAccountDropdown = $x("//div[@data-test='myaccount-dropdown-desktop-list']");
    private final SelenideElement myAccountButton = $x("(//button[contains(.,'Mein Konto')])[2]");
    private final SelenideElement myMarketButton = $x("(//button[contains(.,'Mein Markt')])[1]");


    public void myAccountDropdownIsVisible(){
        elementIsVisible(myAccountDropdown);
    }

    public void clickOnMyAccountButton(){
        clickOnElement(myAccountButton);
    }

    public void clickOnMyMarketButton(){
        clickOnElement(myMarketButton);
    }
}
