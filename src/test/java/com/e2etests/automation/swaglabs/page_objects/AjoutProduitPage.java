package com.e2etests.automation.swaglabs.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AjoutProduitPage {
	public ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	public static WebElement boutonAdd;
	
	@FindBy(how = How.CSS, using = ".shopping_cart_badge")
	public static WebElement shoppingCartBadge;
	
	
	
	public AjoutProduitPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Methods */
	
	public void boutonAdd() {
		boutonAdd.click();
	}
	
	public void nbrProduit() {
		String nbrProduit = shoppingCartBadge.getText();
		Assert.assertEquals("1", nbrProduit);
		System.out.println(nbrProduit);
	}
	

}
