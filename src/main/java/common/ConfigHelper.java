package common;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ConfigHelper {
    private static ConfigHelper configHelper = null;

    public static ConfigHelper getInstance() {
        if (configHelper == null) {
            configHelper = new ConfigHelper();
        }
        return configHelper;
    }

    static String configLocation;

    static {
        if (!System.getProperty("os.name").toLowerCase().contains("win")) {
            configLocation = "/src/test/resources/ConfigFiles/";
        } else {
            configLocation = "\\src\\test\\resources\\ConfigFiles\\";
        }
    }

    public String GetConfigValue(String valueKey) {
        String config = "Unkown";
        String prop =
                System.getProperty("Config");

        if (prop != null) {
            if (prop.toLowerCase().contains("prod")) {
                System.out.println("Prod Configuration found!");
                config = configLocation + "Prod.json";
            }
        } else {
            System.out.println("No Config Found! May use -DConfig for configuration. Using Default Abnahme");
            System.setProperty("Config", "abnahme");
            config = configLocation + "AbnahmeConfig.json";
        }
        return ReadConfig(config, valueKey);

    }

    public String GetBrowserConfig(String value) {
        return ReadConfig(configLocation + "BrowserLocalConfig.json", value);
    }

    public String GetSystemConfig(String value) {
        return ReadConfig(configLocation + "SystemConfig.json", value);
    }


    public String ReadConfig(String config, String valueKey) {
        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader((System.getProperty("user.dir") + config)));
            JSONObject jsonObject = (JSONObject) obj;
            return (String) jsonObject.get(valueKey);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
