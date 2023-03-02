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
	
	@FindBy(css = "#accountLink")
	 public WebElement accountBtn;
	
	@FindBy(css = "#previousPasswordInput")
	public WebElement previousPasswordField;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement newPasswordfield;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement confirmNewPasswordfield;
	
	@FindBy(css = "#credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement passwordUpdatedMessage;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement nameOnCardField;
	
	@FindBy(css = "#expirationMonthInput")
	public WebElement expirationMonthDropDown;
	
	@FindBy(css = "#expirationYearInput")
	public WebElement expirationYearDropDown;
	
	@FindBy(xpath = "//input[contains (@id, 'securityCodeInput')]")
	public WebElement securityCodeField;
	
	@FindBy(xpath = "//button[contains(text(),'Add Your card')]")
	public WebElement addYourCardBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement addPaymentMethodLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[last()]")
	public WebElement paymentMethodAddedMessage;
	
	@FindBy(xpath = "//p[contains(text(),'Master Card')]")
	public WebElement masterCard;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement eidtBtnForCard;
	
	@FindBy(xpath = "//button[contains(text(),'Update Your Card')]")
	public WebElement updateYourCardBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentMethodEidtMessage;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement removeYourCardBtn;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/*[1]")
	public WebElement addAddressIcon;
	
	@FindBy(css = "#countryDropdown")
	public WebElement countryDropDown;
	
	@FindBy(css = "#fullNameInput")
	public WebElement addressFullNameField;
	
	@FindBy(xpath = "//input[@id='phoneNumberInput']")
	public WebElement addressPhoneNumberField;
	
	@FindBy(xpath = "//input[@name='street']")
	public WebElement addressField;
	
	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentField;
	
	@FindBy(css = "#cityInput")
	public WebElement cityField;
	
	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateDropDown;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeField;
	
	@FindBy(css = "#addressBtn")
	public WebElement addYourAddessBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedMessage;
	
	@FindBy(xpath ="(//button[@class='account__address-btn'])[1]")
	public WebElement eidtAddressBtn;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateAddressBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpadedMessage;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeAddressBtn;
	
	@FindBy(xpath = "//div[@class='account__address-single']")
	public WebElement addressBox;
	}
