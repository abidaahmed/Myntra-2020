package MyntraStepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ActionMyntra.ContactAct;

public class ContactStepDef {


	ContactAct StepDef = new ContactAct();

	@Given("^Myntra Homepage is launched1\\.$")
	public void Myntra_Homepage_is_launched1()  {
		StepDef.getHomePage1();
	  
	}


	@When("^click on contact us$")
	public void click_on_contacta_us() throws Exception   {
		StepDef.contactus();
	       
	}


	@Then("^click on frequently asked questions$")
	public void click_on_frequently_asked_questions() throws Exception {
		StepDef.frequentlyasked();
	}

	 
	@Then("^customer scrolled down and click to view Email verification policy$")
	public void customer_scrolled_down_and_click_to_view_Email_verification_policy() throws Exception   {
		StepDef.verificationquestion();
	       
	}
	
	@Then("^customer should be able to view the policy message.$")
	public void customer_should_be_able_to_view_the_policy_message() throws Exception   {
		StepDef.textdisplay();
	       
	}
	
	
	
}
