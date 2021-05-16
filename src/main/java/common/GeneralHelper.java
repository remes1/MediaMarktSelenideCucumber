package common;

import org.apache.commons.codec.binary.Base64;

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

}
