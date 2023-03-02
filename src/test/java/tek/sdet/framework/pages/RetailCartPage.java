package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailCartPage extends BaseSetup {
	
	public RetailCartPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(css = "#addAddressBtn")
    public WebElement addAddressLink;
	
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement addCreditOrDebitCardLink;
	
    @FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeYourOrderBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Order Placed, Thanks')]")
	public WebElement orderPlacedMsg;
	
	@FindBy(xpath = "//button[contains (text(), 'Proceed to Checkout')]")
    public WebElement proceedToChectoutBtn;

}
