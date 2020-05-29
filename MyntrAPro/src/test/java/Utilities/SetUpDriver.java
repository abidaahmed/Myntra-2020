package Utilities;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUpDriver {

	public static WebDriver chromeDriver;
	
	public static void setupChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		chromeDriver = new ChromeDriver();
	
	}
	
	public WebDriver getChromeDriver() {
		return chromeDriver;
		
	}
	
	public static void tearDownChromeDriver() {
		chromeDriver.quit();
	}


}


//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
