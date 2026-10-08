package com.devops.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class XPATHManager {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fs = new FileInputStream("src/main/java/com/devops/properties/Xpath.properties");
            properties.load(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getXpath(String key) {
        // properties.setProperty(key, key)
        return properties.getProperty(key);

    }
}
