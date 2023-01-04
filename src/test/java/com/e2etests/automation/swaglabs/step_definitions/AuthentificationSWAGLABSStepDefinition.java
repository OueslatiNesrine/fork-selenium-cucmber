package com.e2etests.automation.swaglabs.step_definitions;

import com.e2etests.automation.swaglabs.page_objects.AuthentificationSWAGLABSPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationSWAGLABSStepDefinition {

	public AuthentificationSWAGLABSPage authentificationSWAGLABSPage;

	public AuthentificationSWAGLABSStepDefinition() {
		authentificationSWAGLABSPage = new AuthentificationSWAGLABSPage();
	}

	@Given("Je me connecte sur l application SWAGLABS")
	public void jeMeConnecteSurLApplicationSWAGLABS() {
		authentificationSWAGLABSPage.goToUrl();
	}

	@When("Je saisis un identifiant {string}")
	public void jeSaisisUnIdentifiant(String name) {
		authentificationSWAGLABSPage.fillUserName(name);
	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		authentificationSWAGLABSPage.fillPassword(password);
	}

	@When("Je tape sur le bouton Login")
	public void jeTapeSurLeBoutonLogin() {
		authentificationSWAGLABSPage.clickOnLogin();
	}

	@Then("Je me redirige vers la page principale")
	public void jeMeRedirigeVersLaPagePrincipale() throws InterruptedException {
		authentificationSWAGLABSPage.verify();
	}

}
