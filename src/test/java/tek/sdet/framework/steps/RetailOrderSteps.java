package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@When("User click pn Orders section")
	public void userClickPnOrdersSection() {
	 click(factory.homePage().ordersBtn);
	 logger.info("User click on Orders button");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().orderDeatailBtn);
	   logger.info("User shouled see the first order deatails on the List");
	}
	@When("User click on Cancel the Order button")
	public void userClickOnCancelTheOrderButton() {
	   click(factory.orderPage().cancelOrderBtn);
	   logger.info("User click on Cancel Order button");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelationReason) {
	   selectByVisibleText(factory.orderPage().cancelationDropDown, cancelationReason);
	   logger.info("User select the Cancelation Reason");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	  click(factory.orderPage().cancelOrderSubmitBtn);
	  logger.info("User click on Cancel Your Order submission button");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String message) {
	    waitTillPresence(factory.orderPage().orderCancelationMsg);
	    Assert.assertEquals(factory.orderPage().orderCancelationMsg.getText(), message);
	    logger.info("A meaage should be displayed Your Order Has Been Cancelled");
	}
	@When("User click on Return items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnItemsBtn);
	    logger.info("User click on Return Items");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String returnReason) {
		selectByVisibleText(factory.orderPage().returnReasonDropDown, returnReason);
		logger.info("User select the return reason");
	    
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().serviceProviderDropDown, string);
		logger.info("User select the service provider");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().returnOrderBtn);
	    logger.info("User click on Return order button");
	}
	@Then("a cancelation message should be displayed for return order {string}")
	public void aCancelationMessageShouldBeDisplayedForReturnOrder(String message) {
		waitTillPresence(factory.orderPage().returnSucessfullMsg);
		Assert.assertEquals(factory.orderPage().returnSucessfullMsg.getText(), message);
		logger.info("A message should be Displayed for Returning the order");
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	  click(factory.orderPage().reviewBtn);
	  logger.info("User click on review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String description) {
	    sendText(factory.orderPage().reviewHeadlineField, headline);
	    sendText(factory.orderPage().reviewDescriptionField, description);
	    logger.info("User wrote a review");
	}
	@When("User click on Add your Review button")
	public void userClickOnAddYourReviewButton() {
	  click(factory.orderPage().addYourReviewBtn);
	  logger.info("User click on Add YOur Review button");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewMessage) {
		waitTillPresence(factory.orderPage().reviewAddedMsg);
		Assert.assertEquals(factory.orderPage().reviewAddedMsg.getText(), reviewMessage);
		logger.info("A message should be Displayed Your Review Was Added Successfully");
	}

}
