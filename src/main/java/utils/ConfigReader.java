package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigReader {
    public static final Logger logger = Logger.getLogger(ConfigReader.class.getName());
    private static final String CONFIG_FILE = "/configuration.properties";
    private final Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try (InputStream inputStream = ConfigReader.class.getResourceAsStream(CONFIG_FILE)) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                logger.log(Level.SEVERE, "Cannot find config file: " + CONFIG_FILE);
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error loading config file", e);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static int getTimeImplicit() {
        int defaultValue = 5000;
        try {
            ConfigReader configReader = new ConfigReader();
            return Integer.parseInt(configReader.getProperty("app.implicitlyWait"));
        } catch (NumberFormatException e) {
            logger.log(Level.WARNING, "Invalid implicitlyWait value. Using default value: " + defaultValue, e);
            return defaultValue;
        }
    }

    public static String getBaseUrl() {
        ConfigReader configReader = new ConfigReader();
        return configReader.getProperty("app.baseurl");
    }

    public static String getBrowser() {
        ConfigReader configReader = new ConfigReader();
        return configReader.getProperty("app.Navegador");
    }

    public static boolean isHeadlessModeEnabled() {
        ConfigReader configReader = new ConfigReader();
        String headlessMode = configReader.getProperty("app.headless.mode");
        return Boolean.parseBoolean(headlessMode);
    }

    public static String obtenerColorElemento() {
        ConfigReader configReader = new ConfigReader();
        return configReader.getProperty("color.element");
    }

    public static int obtenerTiempoResaltadoElemento() {
        ConfigReader configReader = new ConfigReader();
        return Integer.parseInt(configReader.getProperty("color.time"));
    }

    public static String obtenerHabilitacionColor() {
        ConfigReader configReader = new ConfigReader();
        return configReader.getProperty("color.enabled");
    }

    public static int obtenerTiempoExplicito(){
        ConfigReader configReader = new ConfigReader();
        return Integer.parseInt(configReader.getProperty("app.explicitWait"));
    }

}
