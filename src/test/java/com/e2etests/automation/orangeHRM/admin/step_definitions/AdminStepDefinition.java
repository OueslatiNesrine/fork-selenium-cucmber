package com.e2etests.automation.orangeHRM.admin.step_definitions;

import com.e2etests.automation.orangeHRM.admin.page_objects.AdminPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {

	public AdminPage adminPage;

	public AdminStepDefinition() {
		adminPage = new AdminPage();
	}

	@When("Je clique sur le module admin")
	public void jeCliqueSurLeModuleAdmin() throws InterruptedException {
		adminPage.clickOnAdmin();
	}

	@And("Je saisis {string} dans le champ Username")
	public void jeSaisisDansLeChampUsername(String username) {
		adminPage.fillUsername(username);

	}

	@And("Je clique sur le bouton Search")
	public void jeCliqueSurLeBoutonSearch() {
		adminPage.clickOnBtnSearch();

	}

	@Then("Je verifie la presence d un utilisateur dans le tableau")
	public void jeVerifieLaPresenceDUnUtilisateurDansLeTableau() {

	}

	@When("Je clique sur Rest")
	public void jeCliqueSurReset() {
		adminPage.clickOnBtnReset();

	}

	@Then("Je me redirige vers le tableau d'affichage de tous les utilasteurs")
	public void jeMeRedirigeVersLeTableauDAffichageDeTousLesUtilasteurs() {

	}

}
