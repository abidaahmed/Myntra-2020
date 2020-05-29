package MyntraUtilitiess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUppDriver {
	

	public static WebDriver chromeDriver;

	public static void setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		chromeDriver = new ChromeDriver();
		
	}

	public static WebDriver getChromeDriver() {
		return chromeDriver;
		
	}

	public static void tearDownChromeDriver() {
		chromeDriver.quit();
	}


}
