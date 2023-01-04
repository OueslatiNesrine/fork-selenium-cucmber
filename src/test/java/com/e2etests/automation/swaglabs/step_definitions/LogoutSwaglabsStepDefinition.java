package com.e2etests.automation.swaglabs.step_definitions;


import com.e2etests.automation.swaglabs.page_objects.LogoutSwaglabsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSwaglabsStepDefinition {
	
	public LogoutSwaglabsPage logoutSwaglabsPage;

	public LogoutSwaglabsStepDefinition () {
		logoutSwaglabsPage = new LogoutSwaglabsPage();
	}
	

	@When("Je clique sur le bouton burger")
	public void jeCliqueSurLeBoutonBurger() {
		logoutSwaglabsPage.boutonBurger();
	  
	}
	 
	@And("Je clique sur le bouton LogOut")
	public void jeCliqueSurLeBoutonLogOut(){
		logoutSwaglabsPage.boutonLogOut();
	}
	@Then("Je me retourne vers la page principale")
	public void jeMeRetourneVersLaPagePrincipale() {
	    
	}




}
