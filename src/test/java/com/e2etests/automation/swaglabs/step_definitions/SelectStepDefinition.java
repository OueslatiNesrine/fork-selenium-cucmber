package com.e2etests.automation.swaglabs.step_definitions;



import com.e2etests.automation.swaglabs.page_objects.SelectPageObject;
import com.e2etests.automation.utils.SelectFromListUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectStepDefinition {
	
	public SelectPageObject selectPageObject;
	public SelectFromListUtils selectFromListUtils;

	public SelectStepDefinition() {
		selectPageObject = new SelectPageObject();
		selectFromListUtils = new SelectFromListUtils();
	}
	

	@When("je choisi le choix {string}")
	public void jeChoisiLeChoix(String string) {
		selectFromListUtils.selectDropDownListByIndex(SelectPageObject.select, 3);
		//selectFromListUtils.selectDropDownListByValue(selectPageObject.select, "za");
		//selectFromListUtils.selectDropDownListByVisibleText(selectPageObject.select, "Name (A to Z)");
		
	   
	}
	@Then("Je me trie produit a partir price low to high")
	public void jeMeTrieProduitAPartirPriceLowToHigh() {
	  selectPageObject.priceHL();
	}




}
