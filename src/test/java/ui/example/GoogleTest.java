package ui.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pageobjects.example.GoogleExamplePage;
import ui.BaseTest;

public class GoogleTest extends BaseTest {

    private final static String SEARCH_QUERY = "Don't use hardcode values!";
    private final static Logger LOG = LoggerFactory.getLogger(GoogleTest.class);

    @Test(description = "This is google test", groups = {"P0", "smoke"})
    public void testGoogleSearch() {
        LOG.info("Verify that results are displayed");
        new GoogleExamplePage()
                .search(SEARCH_QUERY)
                .resultsAreDisplayed();
    }
}
