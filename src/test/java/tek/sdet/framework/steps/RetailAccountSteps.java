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
import tek.sdet.framework.utilities.DataGeneratorUtility;

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
	@Given("User fill Debit or Credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<List<String>> paymentInfo = dataTable.asLists(String.class);
	    sendText(factory.accountPage().cardNumberField, DataGeneratorUtility.data(paymentInfo.get(0).get(0)));
	    sendText(factory.accountPage().nameOnCardField, DataGeneratorUtility.data(paymentInfo.get(0).get(1)));
	    selectByVisibleText(factory.accountPage().expirationMonthDropDown, DataGeneratorUtility.data(paymentInfo.get(0).get(2)));
	    selectByVisibleText(factory.accountPage().expirationYearDropDown, DataGeneratorUtility.data(paymentInfo.get(0).get(3)));
	    sendText(factory.accountPage().securityCodeField, DataGeneratorUtility.data(paymentInfo.get(0).get(4)));
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
		List<List<String>> eidtPaymentInfo = dataTable.asLists(String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberField);
		sendText(factory.accountPage().cardNumberField, DataGeneratorUtility.data(eidtPaymentInfo.get(0).get(0)));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
		sendText(factory.accountPage().nameOnCardField, DataGeneratorUtility.data(eidtPaymentInfo.get(0).get(1)));
		selectByVisibleText(factory.accountPage().expirationMonthDropDown, DataGeneratorUtility.data(eidtPaymentInfo.get(0).get(2)));
		selectByVisibleText(factory.accountPage().expirationYearDropDown, DataGeneratorUtility.data(eidtPaymentInfo.get(0).get(3)));
		clearTextUsingSendKeys(factory.accountPage().securityCodeField);
		sendText(factory.accountPage().securityCodeField, DataGeneratorUtility.data(eidtPaymentInfo.get(0).get(4)));
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
		logger.info("User removed payment details and will not be Displayed");
	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		scrollPageDownWithJS();  
		click(factory.accountPage().addAddressIcon);
		logger.info("User Scroll down the page and click on Add Address");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<List<String>> addressInfo =dataTable.asLists(String.class);
	    selectByVisibleText(factory.accountPage().countryDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(0)));
	    sendText(factory.accountPage().addressFullNameField, DataGeneratorUtility.data(addressInfo.get(0).get(1)));
	    sendText(factory.accountPage().addressPhoneNumberField, DataGeneratorUtility.data(addressInfo.get(0).get(2)));
	    sendText(factory.accountPage().addressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
	    sendText(factory.accountPage().apartmentField, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
	    sendText(factory.accountPage().cityField, DataGeneratorUtility.data(addressInfo.get(0).get(5)));
	    selectByVisibleText(factory.accountPage().stateDropDown, DataGeneratorUtility.data(addressInfo.get(0).get(6)));
	    sendText(factory.accountPage().zipCodeField, DataGeneratorUtility.data(addressInfo.get(0).get(7)));
	    logger.info("User fillout the Address Form");
	}
	@When("User click Add Your Address button")
	public void userClickAddAddressButton() {
		click(factory.accountPage().addYourAddessBtn);
		logger.info("User click on Add Your Address button");
	   
	}
	@Then("A message should be displayed for Adding Address {string}")
	public void aMessageShouldBeDisplayedForAddingAddress(String string) {
		waitTillPresence(factory.accountPage().addressAddedMessage);
		Assert.assertEquals(string, factory.accountPage().addressAddedMessage.getText());
	   logger.info("User" + factory.accountPage().addressAddedMessage.getText());
	}
	@When("User click on eidt address option")
	public void userClickOnEidtAddressOption() {
		scrollPageDownWithJS();
		click(factory.accountPage().eidtAddressBtn);
		logger.info("User click on Eidt option");
	}
	@When("User eidt address form with below information")
	public void userEidtAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
	    selectByVisibleText(factory.accountPage().countryDropDown, addressInfo.get(0).get("country"));
	    clearTextUsingSendKeys(factory.accountPage().addressFullNameField);
	    sendText(factory.accountPage().addressFullNameField, addressInfo.get(0).get("fullName"));
	    clearTextUsingSendKeys(factory.accountPage().addressPhoneNumberField);
	    sendText(factory.accountPage().addressPhoneNumberField, addressInfo.get(0).get("phoneNumber"));
	    clearTextUsingSendKeys(factory.accountPage().addressField);
	    sendText(factory.accountPage().addressField, addressInfo.get(0).get("streetAddress"));
	    clearTextUsingSendKeys(factory.accountPage().apartmentField);
	    sendText(factory.accountPage().apartmentField, addressInfo.get(0).get("apt"));
	    clearTextUsingSendKeys(factory.accountPage().cityField);
	    sendText(factory.accountPage().cityField, addressInfo.get(0).get("city"));
	    selectByVisibleText(factory.accountPage().stateDropDown, addressInfo.get(0).get("state"));
	    clearTextUsingSendKeys(factory.accountPage().zipCodeField);
	    sendText(factory.accountPage().zipCodeField, addressInfo.get(0).get("zipCode"));
	    logger.info("User Eidt the Address Form");
	}
	@When("User click on update Your Address button")
	public void userClickOnUpdateYourAddressButton() {
	    click(factory.accountPage().updateAddressBtn);
	    logger.info("User click on Update Your Address button");
	}
	@Then("A message should be displayed for Updating Address {string}")
	public void aMessageShouldBeDisplayedForUpdatingAddress(String string) {
		waitTillPresence(factory.accountPage().addressUpadedMessage);
		Assert.assertEquals(string, factory.accountPage().addressUpadedMessage.getText());
	   logger.info("User" + factory.accountPage().addressUpadedMessage.getText()); 
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	 click(factory.accountPage().removeAddressBtn);
	 logger.info("User click on Remove button at the address section");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		isElementDisplayed(factory.accountPage().addressBox);
		logger.info("Address should be removed from the Account section");
	}

}
