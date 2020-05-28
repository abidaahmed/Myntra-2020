package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsM {
	


	@FindBy (xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a")
	public WebElement KidsButton;
	
	@FindBy (xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[4]/ul/li[11]/a")
	public WebElement BagandBackPackButton;
	
	@FindBy (xpath = "//div[@class='vertical-filters-filters brand-container']")
	public WebElement BrandFrame;
	
	@FindBy (xpath = "//label[contains(text(),'Nike')]")
	public WebElement NikeBrand;
	
	@FindBy (xpath = "//li[2]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	public WebElement searchitemdisplay;
	
	
	@FindBy (xpath = "//div[contains(text(),'ADD TO BAG')]")
	public WebElement addtobag;
}


////*[@id="desktop-header-cnt"]/div[2]/nav/div/div[3]/div/a (kids button)
////*[@id="desktop-header-cnt"]/div[2]/nav/div/div[3]/div/div/div/div/li[4]/ul/li[11]/a (bags and backpack)
////li[2]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]




