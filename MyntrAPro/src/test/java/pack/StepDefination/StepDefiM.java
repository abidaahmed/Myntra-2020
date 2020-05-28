package pack.StepDefination;

import org.testng.Assert;

import Action.MyntraAction;
import Elements.ElementsM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefiM {
	   
	    	
	    MyntraAction ActionMyn = new MyntraAction();
	    
	    
	    	
	@Given("^Myntra Homepage is launched\\.$")
	public void myntra_Homepage_is_launched()  {
	    ActionMyn.getHomePage();
	  
	}

	
	@When("^Customer mouse over on kids button$")
	public void customer_mouse_over_on_kids_button()   {
	       ActionMyn.clickKidsButton();      
	}

	
	@Then("^selects Bags & BackPacks button$")
	public void selects_Bags_and_BackPacks_button() throws Exception   {
	       ActionMyn.BagandBackPackButton();
	       
	}

	
	@Then("^click on Nike Brand$")
	public void click_on_Nike_Brand() throws Exception {
	     ActionMyn.nikeBrand();
	}
	
	
	 @Then("^select a random bag$")
	 public  void select_a_random_bag() {
		 ActionMyn.searchitemdisplay();
	}

	 
	@Then("^Customer should successfully add to bag\\.$")
	public void customer_should_successfully_add_to_bag() throws Exception   {
	       ActionMyn.addtobag();
	       
	}

	    
	    
}
