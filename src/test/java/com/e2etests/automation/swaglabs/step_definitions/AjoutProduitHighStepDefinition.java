package com.e2etests.automation.swaglabs.step_definitions;

import com.e2etests.automation.swaglabs.page_objects.AjoutProduitHighPage;
import com.e2etests.automation.swaglabs.page_objects.AjoutProduitPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutProduitHighStepDefinition {
	public AjoutProduitHighPage ajoutProduitHighPage;
	public AjoutProduitPage ajoutProduitPage;

	public AjoutProduitHighStepDefinition() {
		ajoutProduitHighPage = new AjoutProduitHighPage();
		ajoutProduitPage = new AjoutProduitPage();
		

	}

	@When("je clique sur le bouton Add de premiere produit affichier")
	public void jeCliqueSurLeBoutonAddDePremiereProduitAffichier() {
		ajoutProduitHighPage.boutonAddProdHigh();
	  
	}
	@Then("je verifie l'ajout de produit High")
	public void jeVerifieLAjoutDeProduitHigh() {
		ajoutProduitPage.nbrProduit();
	  
	}




}
