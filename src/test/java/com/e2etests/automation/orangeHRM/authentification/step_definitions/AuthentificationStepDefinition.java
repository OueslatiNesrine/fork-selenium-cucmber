package com.e2etests.automation.orangeHRM.authentification.step_definitions;

import com.e2etests.automation.orangeHRM.authentification.page_objects.AuthentificationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	public AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		authentificationPage = new AuthentificationPage();
	}

	@Given("Je me connecte sur l application OrangeHRM")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws InterruptedException {
		authentificationPage.goToUrl();
		Thread.sleep(4000);
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String name) {
		authentificationPage.fillUsername(name);
	}

	@And("Je saisis le password {string}")
	public void jeSaisisLePassword(String password) {
		authentificationPage.fillPassword(password);
	}

	@And("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() throws InterruptedException {
		authentificationPage.clickOnBtnLogin();
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	}

}
