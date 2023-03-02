package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Show Details')])[2]")
	public WebElement orderDeatailBtn;
	
	@FindBy(xpath= "//p[contains(text(),'Hide Details')]")
	public WebElement orderHideDetails;
	
	@FindBy(css = "#cancelBtn")
	public WebElement cancelOrderBtn;
	
	@FindBy(css = "#returnBtn")
	public WebElement returnItemsBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancelationDropDown;

	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement cancelOrderSubmitBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement orderCancelationMsg;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement returnReasonDropDown;
	
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement serviceProviderDropDown;
	
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnSucessfullMsg;
	
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public WebElement reviewBtn;
	
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement reviewHeadlineField;
	
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewDescriptionField;
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addYourReviewBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewAddedMsg;
}
