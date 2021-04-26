package test.google.search;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.commons.DriverSetUp;
import main.google.search.SearchActions;

public class SearchPageTests {

	private static final String BASE_URL = "https://www.google.com/";
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = DriverSetUp.setUp(driver);
	}

	@Test
	public void verifyDomainOfSearchHome() {
		driver.get(BASE_URL);
		SearchActions.clickSearchLabel(driver);
		SearchActions.sendSearchKeys(driver);
		SearchActions.verifyDomainOfCurrentPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
