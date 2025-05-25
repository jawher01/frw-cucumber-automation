package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RegisterOutlinePage;

import io.cucumber.java.en.When;

public class RegisterOutlineStepDefinition {

	private RegisterOutlinePage registerOutlinePage;
	
	public RegisterOutlineStepDefinition () {
		this.registerOutlinePage = new RegisterOutlinePage();
	}

	@When("je click sur le lien REGISTER")
	public void jeClickSurLeLienREGISTER() {
		registerOutlinePage.ClickRegister();
	}
	@When("je saisie le FirstName outline {string}")
	public void jeSaisieLeFirstNameOutline(String name) {
		registerOutlinePage.fillFirstName(name);
	}
	@When("je sasie le LastName outline {string}")
	public void jeSasieLeLastNameOutline(String lastName) {
		registerOutlinePage.fillLastName(lastName);
	}
	@When("je sasie le Phone outline {string}")
	public void jeSasieLePhoneOutline(String phone) {
		registerOutlinePage.fillPhoneNumber(phone);
	}
	@When("je sasie le Email outline {string}")
	public void jeSasieLeEmailOutline(String email) {
		registerOutlinePage.fillEmail(email);
	}
	@When("je sasie le Address outline {string}")
	public void jeSasieLeAddressOutline(String address) {
		registerOutlinePage.fillAdress(address);
	}
	@When("je sasie le City outline {string}")
	public void jeSasieLeCityOutline(String city) {
		registerOutlinePage.fillCity(city);
	}
	@When("je sasie le State outline {string}")
	public void jeSasieLeStateOutline(String state) {
		registerOutlinePage.fillState(state);
	}
	@When("je sasie le PostalCode outline {string}")
	public void jeSasieLePostalCodeOutline(String pCode) {
		registerOutlinePage.fillPostalCode(pCode);
	}
	@When("je choisir le Country outline  {string} # Updated to include the country value")
	public void jeChoisirLeCountryOutlineUpdatedToIncludeTheCountryValue(String coutry) {
		registerOutlinePage.selectCountry(coutry);
	}
	@When("je saisie le UserName outline {string}")
	public void jeSaisieLeUserNameOutline(String userName) {
		registerOutlinePage.fillUserName(userName);
	}
	@When("je saisie le Password outline {string}")
	public void jeSaisieLePasswordOutline(String psw) {
		registerOutlinePage.fillPassword(psw);
	}
	@When("je saisie le ConfirmPassword outline {string}")
	public void jeSaisieLeConfirmPasswordOutline(String psw) {
		registerOutlinePage.fillConfirmPassword(psw);
	}
	
	



	
}
