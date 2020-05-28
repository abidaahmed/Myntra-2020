package Utilities;

import cucumber.api.java.After;

public class AfterActionM {

	@After
	public void afterActions() {
		SetUpDriver.tearDownChromeDriver();
	}

	
}
