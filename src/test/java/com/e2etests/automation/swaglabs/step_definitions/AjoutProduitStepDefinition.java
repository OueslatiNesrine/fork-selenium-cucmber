package com.e2etests.automation.swaglabs.step_definitions;

import com.e2etests.automation.swaglabs.page_objects.AjoutProduitPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutProduitStepDefinition {

	public AjoutProduitPage ajoutProduitPage;

	public AjoutProduitStepDefinition() {
		ajoutProduitPage = new AjoutProduitPage();

	}

	@When("je clique sur le bouton Add to cart du produit selectionne.")
	public void jeCliqueSurLeBoutonAddToCartDuProduitSelectionne() {
		ajoutProduitPage.boutonAdd();

	}

	@Then("je verifier que l affichage du panier s incrémente par un.")
	public void jeVerifierQueLAffichageDuPanierSIncrémenteParUn() {
		ajoutProduitPage.nbrProduit();
		
	
	}
}
