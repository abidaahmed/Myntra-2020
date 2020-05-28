package Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActionM {
	
	@Before
	public void beforeAction(Scenario scen) {
		System.out.println("======Driver Initialization======");
		SetUpDriver.setupChromeDriver();
		System.out.println(scen.getName());
	}
	
	
	
	
	

}
