package Utilities;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SetUpDriver {

	public static WebDriver chromeDriver;
	
	
	
	public static void setupChromeDriver() {
		//WebDriverManager.chromedriver().version("83.0.4103.61").setup();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		chromeDriver = new ChromeDriver();
	
	}
	
	
	
	public WebDriver getChromeDriver() {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		return chromeDriver;
		
	}
	
	
	
	public static void tearDownChromeDriver() {
		chromeDriver.quit();
	}


}
