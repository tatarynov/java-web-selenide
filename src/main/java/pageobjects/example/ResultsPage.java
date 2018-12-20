package pageobjects.example;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import pageobjects.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class ResultsPage extends BasePage {

    private final By resultsDiv = By.cssSelector("div#res");

    public void resultsAreDisplayed() {
        $(resultsDiv).should(Condition.visible);
    }
}
