package main.google.search;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchActions {
	public static void clickSearchLabel(WebDriver driver) {
		SearchPage.searchLabel(driver).click();
	}

	public static void sendSearchKeys(WebDriver driver) {
		SearchPage.searchLabel(driver).sendKeys("Terralogic LLC", Keys.ENTER);
	}

	public static void clickSearchResult(WebDriver driver) {
		SearchPage.searchResult(driver).click();
	}

	public static String getDomainOfCurrentPage(WebDriver driver) {
		clickSearchResult(driver);
		return driver.getCurrentUrl();
	}

	public static void verifyDomainOfCurrentPage(WebDriver driver) {
		String expectedResult = "https://www.terralogic.com/";
		String actualResult = getDomainOfCurrentPage(driver);
		assertEquals(actualResult, expectedResult);
	}
}
