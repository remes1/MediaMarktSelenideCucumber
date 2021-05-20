package common;

import org.apache.commons.codec.binary.Base64;

import java.util.Random;

public class GeneralHelper {
    private static GeneralHelper generalHelper = null;

    public static GeneralHelper getInstance() {
        if (generalHelper == null) {
            generalHelper = new GeneralHelper();
        }
        return generalHelper;
    }

    public String decodeString(String encodedString) {
        byte[] decoded = Base64.decodeBase64(encodedString);
        return new String(decoded);
    }

    public String generateEmail() {
        Random r = new Random();
        int ramNum = r.nextInt(1000);
        return "username" + ramNum + "@gmail.com";
    }

}
