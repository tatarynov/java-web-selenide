package pageobjects.example;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import pageobjects.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class GoogleExamplePage extends BasePage {

    private final By searchInput = By.cssSelector("input[name=\"q\"]");
    private static final String URL = "";

    public ResultsPage search(String value) {
        $(searchInput)
                .setValue(value)
                .pressEnter();

        return new ResultsPage();
    }

    public GoogleExamplePage() {
        Selenide.open(URL);
    }
}
