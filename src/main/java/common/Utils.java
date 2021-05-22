package common;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchFrameException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Utils {
    private static Utils utils = null;

    public static Utils getInstance() {
        if (utils == null) {
            utils = new Utils();
        }
        return utils;
    }

    public void sleep(long i) throws InterruptedException {
        TimeUnit.SECONDS.sleep(i);
    }

    public void setResolution(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        WebDriverRunner.getWebDriver().manage().window().setSize(dimension);
    }

    public void switchToWindow(int i) {
        switchTo().window(i, Duration.ofSeconds(10));
    }

    public void closeTab(int i) {
        switchTo().window(i).close();
    }

    public void goBack() {
        WebDriverRunner.getWebDriver().navigate().back();
    }

    public void refresh() {
        WebDriverRunner.getWebDriver().navigate().refresh();
    }

    public void maximizeBrowser() {
        getWebDriver().manage().window().maximize();
    }

    public void switchToFrame() {
        try {
            switchTo().frame(0);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }
}
