package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Elements.ElementsM;
import Utilities.SetUpDriver;

public class MyntraAction {

	ElementsM Act;
	Actions action = new Actions(SetUpDriver.chromeDriver);
	
	public MyntraAction () {
		this.Act = new ElementsM();
		PageFactory.initElements(SetUpDriver.chromeDriver, Act);
	}
	

	
	
	
	
	public void getHomePage() {
		SetUpDriver.chromeDriver.get("https://www.myntra.com/");
		SetUpDriver.chromeDriver.manage().window().maximize();
		SetUpDriver.chromeDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		SetUpDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickKidsButton() {
		
		SetUpDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		action.moveToElement(Act.KidsButton).build().perform();

	}
	
	public void BagandBackPackButton() throws Exception {
		Thread.sleep(4000);
		Act.BagandBackPackButton.click();
		Thread.sleep(4000);
		
		
	}
	
	
	
	
	public void nikeBrand() throws Exception {
		
		for (String winHandle : SetUpDriver.chromeDriver.getWindowHandles() ) {
			SetUpDriver.chromeDriver.switchTo().window(winHandle);
	   }
		Thread.sleep(4000);
		action.moveToElement(Act.NikeBrand).build().perform();
		Act.NikeBrand.click();
		Thread.sleep(4000);
	}
		
	
	
	public void searchitemdisplay() {
		SetUpDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Act.searchitemdisplay.click();
		
	}
	
	public void addtobag() throws Exception {

		for (String winHandle : SetUpDriver.chromeDriver.getWindowHandles() ) {
			SetUpDriver.chromeDriver.switchTo().window(winHandle);
	   }
		Thread.sleep(4000);
		action.moveToElement(Act.addtobag).build().perform();
		Act.addtobag.click();
		Thread.sleep(4000);
	}
	
	public String HomePage() {
		String HomePage = SetUpDriver.chromeDriver.getTitle();
		return HomePage;
	}
	
	
}
