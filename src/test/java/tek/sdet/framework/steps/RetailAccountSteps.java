package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User Click on Account option")
	public void userClickOnAccountOption() {
	click(factory.homePage().accountBtn);
	logger.info("User click on Account Button");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
	 clearTextUsingSendKeys(factory.accountPage().accountPageNameField);
	 sendText(factory.accountPage().accountPageNameField, nameValue);
	 clearTextUsingSendKeys(factory.accountPage().accountPagePhoneNumber);
	 sendText(factory.accountPage().accountPagePhoneNumber, phoneValue);
	 logger.info("User updated Name and Phone Number");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	 click(factory.accountPage().accountPageUpdateBtn);
	 logger.info("User click on updated button");
	}
	@Then("User profile information shoud be updated")
	public void userProfileInformationShoudBeUpdated() {
		waitTillPresence(factory.accountPage().personalInformationSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInformationSuccessMessage));
		logger.info("User profile information Updated");
	    
	}

}
