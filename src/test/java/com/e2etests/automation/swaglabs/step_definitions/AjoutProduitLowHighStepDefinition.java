package com.e2etests.automation.swaglabs.step_definitions;

import com.e2etests.automation.swaglabs.page_objects.AjoutProduitLowHighPage;
import com.e2etests.automation.utils.SelectFromListUtils;

import io.cucumber.java.en.When;

public class AjoutProduitLowHighStepDefinition {
	
	public AjoutProduitLowHighPage ajoutProduitLowHighPage;
	public SelectFromListUtils selectFromListUtils;

	public AjoutProduitLowHighStepDefinition() {
		ajoutProduitLowHighPage = new AjoutProduitLowHighPage();
		selectFromListUtils = new SelectFromListUtils();
	}
	

	@When("je saisis le choix {string}")
	public void jeSaisisLeChoix(String string) {
		selectFromListUtils.selectDropDownListByIndex(ajoutProduitLowHighPage.select, 2);
	    
	}




}
