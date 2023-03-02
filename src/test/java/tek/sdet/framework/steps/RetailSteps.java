package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title "+ actualTitle + " Equals " + " Expected Title "+ expectedTitle);
	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchbar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
		
	}
	
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonProductImage));
        logger.info("the Product is displayed on home page");
    }
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	click(factory.homePage().allButton);
	logger.info("User click on All section");
	    
	}
	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);
		List<WebElement> actualSideBar = factory.homePage().sideBarElements;
		for(int i =0; i<expectedSideBar.get(0).size(); i++) {
			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
			logger.info(actualSideBar.get(i).getText() + "is equal to " + expectedSideBar.get(0).get(i));
		}
//		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
//		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
//		logger.info("actual is equal to expected");

	}
	
	@When("User on {string}")
	public void userOn(String department) {
	  List <WebElement> sideBarOptions = factory.homePage().sideBarElements;
	  for(WebElement option : sideBarOptions) {
		if(option.getText().equals(department)) {
			click(option);
			try {
				logger.info(option.getText() + " is present ");
			} catch (StaleElementReferenceException e){
				
			}
			break;
		}
	  }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		
		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;
		
		for (int i = 0 ; i < expectedDepartmentOptions.get(0).size(); i++ ) {
			for(WebElement dept : actualDepartmentOptions ) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i)));
				Assert.assertTrue(isElementDisplayed(dept));
				logger.info(dept.getText() + " is present ");
			}
		}
	   
	}
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
	    selectByVisibleText(factory.homePage().allDepartmentDropDown, string);
	    logger.info("User change the category to " + string);
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
	    click(factory.homePage().searchbar);
	    sendText(factory.homePage().searchbar, string);
	    logger.info("User search for " + string);
	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	    click(factory.homePage().searchButton);
	    logger.info("User click on search button");
	}
	@When("User click on item")
	public void userClickOnItem() {
	   click(factory.homePage().productKasaOutdoorSmartPlug);
	   logger.info("User click on the product");
	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
	    selectByVisibleText(factory.homePage().quantityDropDown, string);
	    logger.info("User change quantity to " + string);
	}
	@When("User click on add to Cart button")
	public void userClickOnAddToCartButton() {
	    click(factory.homePage().addToCartBtn);
	    logger.info("User click on Add To Cart button");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
	   waitTillPresence(factory.homePage().cartQuantity);
	   Assert.assertEquals(factory.homePage().cartQuantity.getText(), string);
	   logger.info("The cart quantity change to "+ string);
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartButton);
	    logger.info("User click on Cart button");
	}
	@Then("User click on procced to Checkout button")
	public void userClickOnProccedToCheckoutButton() {
	    click(factory.cartPage().proceedToChectoutBtn);
	    logger.info("User click on proceed to Checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.cartPage().addAddressLink);
	    logger.info("User click on Add a new Address link");
	}
	@Then("User click Add a credit card or Debit card for payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.cartPage().addCreditOrDebitCardLink);
	    logger.info("User click on Add credit or debit Card");
	}
	@Then("User click on place Your Order")
	public void userClickOnPlaceYourOrder() {
	   click(factory.cartPage().placeYourOrderBtn);
	   logger.info("User place the Order");
	}
	@Then("a message shouled be displayed for placing order {string}")
	public void aMessageShouledBeDisplayedForPlacingOrder(String orderMsg) {
		waitTillPresence(factory.cartPage().orderPlacedMsg);
	  Assert.assertEquals(factory.cartPage().orderPlacedMsg.getText(), orderMsg);
	  logger.info("Order Placed, Thanks should be Displayed");
	}
	
	@When("User click on items")
	public void userClickOnItems() {
	    click(factory.homePage().productApexLegends);
	    logger.info(" user click on Apex Legends product");
	}
	



	
}
