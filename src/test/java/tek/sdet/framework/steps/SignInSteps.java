package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
	click(factory.homePage().signInButton);
	logger.info("User clicked on Sign in Option");
	  
	}
	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passwordValue) {
	sendText(factory.signInPage().emailField, emailValue);
	sendText(factory.signInPage().passwordField, passwordValue);
	logger.info("user entered email " + emailValue + " and Password "+ passwordValue);
	    
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
	click(factory.signInPage().loginPageButton);
	logger.info("user clicked on login button");
	    
	}
	@Then("user should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.homePage().accountBtn));    
	   
	}
	
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("user click on create new account");
	
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> signUpInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameField, signUpInfo.get(0).get("name"));
		sendText(factory.signInPage().signUpEmailfield, signUpInfo.get(0).get("email"));
		sendText(factory.signInPage().signUpPasswordfield, signUpInfo.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordField, signUpInfo.get(0).get("confirm Password"));
		logger.info("User filled the signup information Form");
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpBtn);
		logger.info("User click on SignUp button");
	    
	}
	@Then("User should be logged in into account page")
	public void userShouldBeLoggedInIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("User is logged in into Account page");
	   
	}
}
