package MyntraUtilitiess;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import MyntraUtilitiess.SetUppDriver;

public class BeforeAction {
	

	@Before
	public void beforeActions(Scenario scen){
		System.out.println("===============Driver Initialization================");
		SetUppDriver.setupChromeDriver();
		System.out.println(scen.getName());
	}
	
	


}
