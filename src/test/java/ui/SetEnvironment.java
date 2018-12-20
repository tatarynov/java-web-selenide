package ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import support.DriverManager;
import support.props.GeneralProperties;

public class SetEnvironment {

    private DriverManager driverManager = new DriverManager();
    private GeneralProperties props = GeneralProperties.getInstance();

    @BeforeSuite
    public void setEnvironment() {
        Configuration.browser = props.getBrowser();
        Configuration.baseUrl = props.getBaseUrl();
        Configuration.startMaximized = true;
        Configuration.screenshots = true;
        Configuration.timeout = props.getTimeout();
    }
}
