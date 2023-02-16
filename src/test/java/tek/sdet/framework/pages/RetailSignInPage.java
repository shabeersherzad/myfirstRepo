package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
		// we are implementing pagefactory class to initialaze the UI elements 
		// using initElements method of pagefactory class
		// this method accepts two parameters first one is "driver" second one is "this" keyword
		// using initElements method of PageFactory class       
		// this method accepts two parameters, first one is driver and second       
		// is this keyword which referees to variable of this class in this case      
		// we are referring to UI elements that will store in this class 
		}
	
	
	@FindBy (xpath = "//h1[contains(text(),'TEKSCHOOL')]")
	public WebElement signInPageTitle;
	
	    @FindBy(xpath ="//h1[text()='Sign in']")
	    public WebElement signPageLogo;
	    
	    @FindBy(id ="email")
	    public WebElement emailField;
	    
	    @FindBy(xpath ="(//label[@class = 'font-bold '])[1]")
	    public WebElement emailWord;
	    
	    @FindBy(id ="password")
	    public WebElement passwordField;
	    
	    @FindBy(xpath ="(//label[@class = 'font-bold '])[2]")
	    public WebElement passwordWord;
	    
	    
	    @FindBy(xpath ="//button[text()='Login']")
	    public WebElement loginPageButton;
	    
	    @FindBy(linkText ="Create New Account")
	    public WebElement createNewAccountButton;
	    
	    @FindBy(xpath ="//p[contains(text(),'Or')]")
	    public WebElement orWord;
	    
	    @FindBy(id ="newCompanyAccount")
	    public WebElement  wantToSellSomethingLink;
	    
	    @FindBy(css = "#nameInput")
	    public WebElement nameField;
	    
	    @FindBy(css="#emailInput")
	    public WebElement signUpEmailfield;
	    
	    @FindBy(xpath="//input[@id='passwordInput']")
	    public WebElement signUpPasswordfield;
	    
	    @FindBy(css="#confirmPasswordInput")
	    public WebElement confirmPasswordField;
	  
	    @FindBy(xpath="//button[@class='signup__btn']")
	    public WebElement signUpBtn;
	    
	    
	    
	    
	
	}

