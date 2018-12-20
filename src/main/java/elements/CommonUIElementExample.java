package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/***
 * This is example for common UI Elements that could be used as separate classes
 * Example: tables, buttons, menus
 *
 * Use these elements in your page objects
 */
public class CommonUIElementExample {

    private final By exampleSelector = By.cssSelector("your.css.selector");
    private final By exampleSelectorNoTwo = By.cssSelector("your.css.selector.no.two");

    public void someMethodForElement() {
        $(exampleSelector).click(); // i am clicking on element
        $(exampleSelectorNoTwo).setValue("My test value"); // i am setting value
    }

}
