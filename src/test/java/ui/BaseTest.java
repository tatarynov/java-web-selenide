package ui;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends SetEnvironment {

	@BeforeMethod
	public void setUp() {
		// some additional setup
	}

	@AfterMethod
	public void cloweBrowser() {
		Selenide.close();
	}
}
