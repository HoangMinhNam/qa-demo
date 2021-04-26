package main.commons;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverSetUp {

	static String nodeURL;

	public static WebDriver setUp(WebDriver driver) {
		nodeURL = "http://10.20.29.182:4444/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		try {
			driver = new RemoteWebDriver(new URL(nodeURL), capability);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return driver;
	}
}
