package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy (xpath ="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy (id = "search")
	public WebElement allDepartmentDropDown;
	
	@FindBy (css= "#searchInput")
	public WebElement searchbar;
	
	 @FindBy(xpath = "//button[@id='searchBtn']")
	    public WebElement searchButton; 
	 
	 @FindBy(css = "#accountLink")
	 public WebElement accountBtn;
	 
	 @FindBy(css = "#orderLink")
	 public WebElement ordersBtn;
	 
	 @FindBy(css = "#logoutBtn")
	 public WebElement logoutBtn;
	 
	    @FindBy(linkText = "Sign in")
	    public WebElement signInButton;
	    
	    @FindBy(id="cartBtn")
	    public WebElement cartButton;
	    
	    @FindBy (xpath= "//button[@id='hamburgerBtn']")
	    public WebElement allButton;
	    
	    @FindBy(linkText = "Test Selenium")
	    public WebElement testSeleniumBtn;
	    
	    @FindBy(css = "#categoryTitle")
	    public WebElement shopByCategoryWord;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
	    public WebElement electronicsWord;
	    
	    @FindBy (xpath = "//img[@alt='TV & Video']")
	    public WebElement tvAndVideoImg;
	    
	    @FindBy (xpath = "//p[contains(text(),'TV & Video')]")
	    public WebElement tvAndVideoIcon;
	    
	    @FindBy (xpath = "//img[@alt='Video Games']")
	    public WebElement videoGamesImg;
	    
	    @FindBy (xpath = "//p[contains(text(),'Video Games')]")
	    public WebElement videoGamesIcon;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Smart Home')]")
	    public WebElement smartHomeWord;
	    
	    @FindBy(xpath = "//img[@alt='Smart Home Lightning']")
	    public WebElement smartHomeLightningImg;
	    
	    @FindBy (xpath = "(//p[@class='home__category-item-text'])[5]")
	    public WebElement smartHomeLightningIcon;
	    
	    @FindBy (xpath = "//img[@alt='Plugs and Outlets']")
	    public WebElement plugsAndOutletsImg;
	    
	    @FindBy (xpath = "(//p[@class='home__category-item-text'])[6]")
	    public WebElement plugsAndOutletsIcon;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Sports')]")
	    public WebElement sportsWord;
	    
	    @FindBy(xpath = "(//p[@class='home__category-item-text'])[7]")
	    public WebElement athleticClothingIcon;
	    
	    @FindBy(xpath = "//img[@alt='Athletic Clothing']")
	    public WebElement athleticClothingImg;
	    
	    @FindBy(xpath = "(//p[@class='home__category-item-text'])[8]")
	    public WebElement exerciseAndFitnessIcon;
	    
	    @FindBy(xpath = "//img[@alt='Exercise & Fitness']")
	    public WebElement exerciseAndFitnessImg;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Automative')]")
	    public WebElement automativeWord;
	    
	    @FindBy(xpath = "(//p[@class='home__category-item-text'])[9]")
	    public WebElement automativePartsAndAccessoriesIcon;
	    
	    @FindBy(xpath = "(//p[@class='home__category-item-text'])[10]")
	    public WebElement moterCycleAndPowersportsIcon;
	    
	    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
	    public WebElement computersWord;
	    
	    @FindBy (xpath= "//img[@alt='Accessories']")
	    public WebElement accessoriesImg;
	    
	    @FindBy (xpath= "(//p[@class='home__category-item-text'])[3]")
	    public WebElement accessoriesIcon;
	    
	    @FindBy (xpath= "//img[@alt='Networking']")
	    public WebElement netWorkingImg;
	    
	    @FindBy (xpath= "(//p[@class='home__category-item-text'])[4]")
	    public WebElement netWorkingIcon;
	    
	    @FindBy(css="#heroImage")
	    public WebElement homePageImage;
	    
	    @FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	    public WebElement pokemonProductImage;
	    
	    @FindBy (xpath = "//div[@class='sidebar_content-item']/span")
	    public List<WebElement> sideBarElements;
	    
	    @FindBy(xpath= "//span[contains(text(),'Electronics')]")
	    public WebElement electronicSideBar;
	    
	    @FindBy(xpath= "//span[contains(text(),'Computers')]")
	    public WebElement computerSideBar;
	    
	    @FindBy(xpath= "//span[contains(text(),'Smart Home')]")
	    public WebElement smartHomeSideBar;
	    
	    @FindBy(xpath= "//span[contains(text(),'Sports')]")
	    public WebElement sportSideBar;
	    
	    @FindBy(xpath= "//span[contains(text(),'Automative')]")
	    public WebElement automativeSideBar;
	    
	    @FindBy (xpath = "//div[@class='sidebar_content-item']/span")
	    public List<WebElement> sideBarOptionElements;
	    
	    @FindBy(xpath= "//option[contains (text(), 'Smart Home')]")
	    public WebElement allDepartmentSmartHomeOption;
	    
	    @FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	    public WebElement productKasaOutdoorSmartPlug;
	    
	    @FindBy(xpath = "//select[@class='product__select']")
	    public WebElement quantityDropDown;
	    
	    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	    public WebElement addToCartBtn;
	    
	    @FindBy(xpath= "//span[@id='cartQuantity']")
	    public WebElement cartQuantity;
	    
	    @FindBy(xpath = "//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	    public WebElement productApexLegends;
        
        
        
        
	
	
}
