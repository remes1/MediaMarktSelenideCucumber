package common;

import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class ConstructorClass {
    //        +----------+
    //        | Common   |
    //        +----------+

    public static ConfigHelper confighelper = ConfigHelper.getInstance();
    public static Utils utils = Utils.getInstance();
    public static GeneralHelper generalHelper = GeneralHelper.getInstance();

    //        +----------+
    //        | Pages    |
    //        +----------+

    public static BasePage basePage = BasePage.getInstance();
    public static HomePage homePage = HomePage.getInstance();
    public static LoginPage loginPage = LoginPage.getInstance();
    public static RegistrationPage registrationPage = RegistrationPage.getInstance();
}
