package main.google.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

	public static WebElement searchLabel(WebDriver driver) {
		return driver.findElement(By.name("q"));
	}

	public static WebElement searchResult(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Terralogic - Software Development and IT Services Company"));		
	}
}
