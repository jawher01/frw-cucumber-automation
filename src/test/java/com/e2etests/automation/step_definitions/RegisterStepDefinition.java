package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {

	private RegisterPage registerPage;

	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("je me redirige vers la page register")
	
	public void jeMeRedirigeVersLaPageRegister() {
		registerPage.clickOnResgister();
	}

	@When("je saisie le FirstName {string}")
	public void jeSaisieLeFirstName(String name) {
		registerPage.fillFirstName(name);
	}

	@When("je sasie le LastName {string}")
	public void jeSasieLeLastName(String lastName) {
		registerPage.fillLastName(lastName);
	}

	@When("je sasie le Phone {string}")
	public void jeSasieLePhone(String phone) {
		registerPage.fillPhoneNumber(phone);
	}

	@When("je sasie le Email {string}")
	public void jeSasieLeEmail(String email) {
		registerPage.fillEmail(email);
	}

	@When("je sasie le Address {string}")
	public void jeSasieLeAddress(String address) {
		registerPage.fillAdress(address);
	}

	@When("je sasie le City {string}")
	public void jeSasieLeCity(String city) {
		registerPage.fillCity(city);
	}

	@When("je sasie le State {string}")
	public void jeSasieLeState(String state) {
		registerPage.fillState(state);
	}

	@When("je sasie le PostalCode {string}")
	public void jeSasieLePostalCode(String code_postale) {
		registerPage.fillPostalCode(code_postale);
	}

	@When("je choisir le Country  {string}  # Updated to include the country value")
	public void jeChoisirLeCountryUpdatedToIncludeTheCountryValue(String country) {
		registerPage.selectCountry(country);
	}

	@When("je saisie le UserName {string}")
	public void jeSaisieLeUserName(String userName) {
		registerPage.fillUserName(userName);
	}

	@When("je saisie le Password {string}")
	public void jeSaisieLePassword(String psw) {
		registerPage.fillPassword(psw);
	}

	@When("je saisie le ConfirmPassword {string}")
	public void jeSaisieLeConfirmPassword(String ConfrimPsw) {
		registerPage.fillConfirmPassword(ConfrimPsw);
	}

	@When("je click sur le bouton sub")
	public void jeClickSurLeBoutonSubmit() {
		registerPage.clickButtonSub();
	}

	@Then("je me redirige vers la page register {string}")
	public void jeMeRedirigeVersLaPageRegister(String text) {
         String url = Setup.getDriver().getCurrentUrl();
         Assert.assertEquals(text,url);
	}

}
