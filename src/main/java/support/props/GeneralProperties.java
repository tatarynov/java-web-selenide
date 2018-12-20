package support.props;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

import static java.lang.System.getProperty;
import static support.props.Properties.*;

public class GeneralProperties {

    private Properties props = new Properties();
    private String browser;
    private int timeout;
    private String baseUrl;

    private static GeneralProperties instance;

    private final static String CONFIG_FILE = "config.properties";
    private final static Logger LOG = LoggerFactory.getLogger(GeneralProperties.class);


    private GeneralProperties() {
        InputStream inputStream;
        try {
            String resource = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource(CONFIG_FILE)).getPath();
            inputStream = new FileInputStream(resource);
            props.load(inputStream);

            browser = getPropValue(BROWSER);
            baseUrl = getPropValue(BASE_URL);
            timeout = Integer.parseInt(getPropValue(TIMEOUT));

        } catch (java.io.IOException e) {
            e.printStackTrace();
            LOG.error("Configuration file is not found!");
        }
    }

    private String getPropValue(String propName) {
        return getProperty(propName, "").isEmpty() ? props.getProperty(propName) : getProperty(propName);
    }

    public static GeneralProperties getInstance() {
        if (instance == null) instance = new GeneralProperties();
        return instance;
    }

    public String getBrowser() {
        return browser;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
