package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("je me connecte sur lapplication Mercery")
	public void jeMleConnecteSurLapplicationMercery() {
		authenticationPage.goToUrl();
	}

	@When("je saisi le Username {string}")
	public void jeSaisiLeUsername(String name) {
		authenticationPage.fillUserName(name);
	}

	@When("je sasi le Password {string}")
	public void jeSaisiLePassword(String psw) {
		authenticationPage.fillPassword(psw);
	}

	@When("je click sur le bouton submit")
	public void jeClickSurLeBoutonSubmit() {
		authenticationPage.clickOnBtnSubmit();
	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) throws InterruptedException {
		Thread.sleep(9000);
		String msg = AuthenticationPage.welcomeMsg.getText();
		Assert.assertEquals(text, msg);
	}

}
