package MyntraUtilitiess;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import MyntraUtilitiess.SetUppDriver;

public class AfterAction {
	

	
	@After
	public void afterActions() {
		SetUppDriver.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		SetUppDriver.tearDownChromeDriver();
	}

}
