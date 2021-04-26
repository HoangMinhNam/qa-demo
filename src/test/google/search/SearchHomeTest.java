package test.google.search;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.commons.DriverSetUp;
import main.google.search.SearchAction;

public class SearchHomeTest {

	private static final String BASE_URL = "https://www.google.com/";
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = DriverSetUp.setUp(driver);
	}

	@Test
	public void verifyDomainOfSearchHome() {
		driver.get(BASE_URL);
		SearchAction.clickSearchLabel(driver);
		SearchAction.sendSearchKeys(driver);
		SearchAction.verifyDomainOfCurrentPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
