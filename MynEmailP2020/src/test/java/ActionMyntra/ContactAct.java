package ActionMyntra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import MyntraUtilitiess.SetUppDriver;
import ElementMyntra.ContactEle;

public class ContactAct {
	ContactEle Elements;
	Actions action = new Actions(SetUppDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetUppDriver.chromeDriver;
	
	
	public ContactAct() {
		this.Elements = new ContactEle();
		PageFactory.initElements(SetUppDriver.chromeDriver, Elements);
	}
	
	public void getHomePage1() {
		SetUppDriver.chromeDriver.get("https://www.myntra.com/");
		SetUppDriver.chromeDriver.manage().window().maximize();
		SetUppDriver.chromeDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		SetUppDriver.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	

	
	public void contactus() throws Exception {
		 /*for (String winHandle : SetUppDriver.chromeDriver.getWindowHandles() ) {
				SetUppDriver.chromeDriver.switchTo().window(winHandle);
		   }*/
		 ((JavascriptExecutor) SetUppDriver.chromeDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 action.moveToElement(Elements.contactus).build().perform();
		Thread.sleep(4000);
		Elements.contactus.click();
		Thread.sleep(4000);
	}
	public void frequentlyasked() throws Exception {
		 for (String winHandle : SetUppDriver.chromeDriver.getWindowHandles() ) {
				SetUppDriver.chromeDriver.switchTo().window(winHandle);
		   }
		Thread.sleep(4000);
		action.moveToElement(Elements.frequentlyasked).build().perform();
		Elements.frequentlyasked.click();
	}

    public void verificationquestion() throws Exception {
    	 ((JavascriptExecutor) SetUppDriver.chromeDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	
    	Thread.sleep(4000);
    	action.moveToElement(Elements.verificationquestion).build().perform();
    	Thread.sleep(4000);
    	Elements.verificationquestion.click();
    	Thread.sleep(4000);
    }
    
   public void textdisplay() throws Exception{
    	Thread.sleep(4000);
    	Elements.textdisplay.click();
    	Thread.sleep(8000);
    }
    
 
    
	public String HomePage1() {
		String HomePage1 = SetUppDriver.chromeDriver.getTitle();
		return HomePage1;
	}
	

}
