package hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.WebDriverRunner.*;
import static common.ConstructorClass.confighelper;

public class Hooks {
    //@Before
    //public void startUp() {
//
    //    if (Configuration.remote == null) {
    //        //This is the local configuration! A BrowserLocalConfig.json is needed!
    //        String browserconfig = System.getProperty("BROWSER");
    //        if (browserconfig != null) {
    //            System.out.println(("Execution is local!"));
    //            switch (browserconfig.toLowerCase()) {
//
    //                case "firefox":
    //                    Configuration.browser = "firefox";
    //                    System.out.println("firefox Browser is used!");
    //                    break;
    //                case "edge":
    //                    Configuration.browser = "edge";
    //                    System.out.println("edge Browser is used!");
    //                    break;
    //                default:
    //                    Configuration.browser = "chrome";
    //                    System.out.println("Chrome Browser is used!");
    //                    break;
    //            }
    //        }
    //    }
    //}

    @After
    public void tearDown() {
        closeWebDriver();
    }

}
