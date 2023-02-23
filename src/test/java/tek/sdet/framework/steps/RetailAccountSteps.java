package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
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
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> passwordInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountPage().previousPasswordField, passwordInfo.get(0).get("previousPassword"));
	    sendText(factory.accountPage().newPasswordfield, passwordInfo.get(0).get("newPassword"));
	    sendText(factory.accountPage().confirmNewPasswordfield, passwordInfo.get(0).get("ConfirmNewPassword"));
	    logger.info("User put new Password Information");
	}
	@When("User click on change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("User click on change Password Button");
	    
	}
	@Then("A message should be displayed Password Updated Successfully")
	public void aMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().passwordUpdatedMessage);
		Assert.assertTrue(isElementDisplayed( factory.accountPage().passwordUpdatedMessage));
		logger.info("User updated the password");
	    
	}
	
	@Given("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().addPaymentMethodLink);
	    logger.info("User click add a payment Method");
	}
	@Given("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> paymentInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountPage().cardNumberField, paymentInfo.get(0).get("cardNumber"));
	    sendText(factory.accountPage().nameOnCardField, paymentInfo.get(0).get("nameOnCard"));
	    selectByValue(factory.accountPage().expirationMonthDropDown, paymentInfo.get(0).get("expirationMonth"));
	    selectByValue(factory.accountPage().expirationYearDropDown, paymentInfo.get(0).get("expirationYear"));
	    sendText(factory.accountPage().securityCodeField, paymentInfo.get(0).get("securityCode"));
	    logger.info("User fill Debit/Credit Card Information");
	    
	}
	@Given("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardBtn);
		logger.info("User click on Add Your Card Button");
	    
	}
	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().paymentMethodAddedMessage);
		Assert.assertEquals(string, factory.accountPage().paymentMethodAddedMessage.getText());
		logger.info("User add payment method Successfully");
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().masterCard);
	    click(factory.accountPage().eidtBtnForCard);
	    logger.info("User click on Master Card first then User click on eidt option");
	}
	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> eidtPaymentInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberField);
		sendText(factory.accountPage().cardNumberField, eidtPaymentInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
		sendText(factory.accountPage().nameOnCardField, eidtPaymentInfo.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthDropDown, eidtPaymentInfo.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearDropDown, eidtPaymentInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeField);
		sendText(factory.accountPage().securityCodeField, eidtPaymentInfo.get(0).get("securityCode"));
		logger.info("User update their card information");
	    
	}
	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardBtn);
		logger.info("User click on updated card button");
	}
	@Then("A message should be displayed for update card {string}")
	public void aMessageShouldBeDisplayedForUpdateCard(String string) {
		waitTillPresence(factory.accountPage().paymentMethodEidtMessage);
		Assert.assertEquals(string, factory.accountPage().paymentMethodEidtMessage.getText());
		logger.info("User updated their card information");
	}
	@When("User click on remove option of Card section")
	public void userClickOnRemoveOptionOfCardSection() {
	    click(factory.accountPage().masterCard);
	    click(factory.accountPage().removeYourCardBtn);
	    logger.info("User click on remove option to remove their Card");
	}
	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().masterCard);
		logger.info("User removed payment details");
	    
	}

}
