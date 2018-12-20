package pageobjects;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.$;

/***
 * This is base page that contains common elements ang common logic across all pages
 * Extend this page to get common functionality
 *
 */
public abstract class BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);

    private final By commonElementForAllPages = By.cssSelector("css.selector.example");
    private final By commonMenu = By.cssSelector("common.menu.example");


    // add abstract methods that should be implemented in child classes
    // i.e.
//	abstract String getUrl();


    public void clickOnMenu() {
        $(commonMenu).click();
    }

    public void setValueForCommonElement(String value) {
        $(commonElementForAllPages).setValue(value);
    }
}
