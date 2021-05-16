package runner;

import com.codeborne.selenide.Configuration;
import common.ConstructorClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports"},
        features = "src/test/java/features",
        tags = {"@smoke"},
        strict = true,
        glue = {"steps", "hooks"}

)

public class RunCucumberTest extends ConstructorClass {
    @BeforeClass
    public static void initSettings() {
        Configuration.timeout = Integer.parseInt(confighelper.GetConfigValue("Timeout"));
    }
}
