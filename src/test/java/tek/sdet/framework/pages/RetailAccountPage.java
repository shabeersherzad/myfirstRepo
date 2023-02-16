package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy (css = "#nameInput")
	public WebElement accountPageNameField;
	
	@FindBy (css = "#personalPhoneInput")
	public WebElement accountPagePhoneNumber;
	
	@FindBy (xpath = "//input[@id='emailInput']")
	public WebElement accountPageEmailField;

	@FindBy (xpath = "//button[@id='personalUpdateBtn']")
	public WebElement accountPageUpdateBtn;
	
	@FindBy(xpath ="//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement personalInformationSuccessMessage;
}
