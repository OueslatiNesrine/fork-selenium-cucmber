package com.e2etests.automation.swaglabs.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AjoutProduitHighPage {
	
	public ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.XPATH, using = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/button")
	public static WebElement boutonAddProdHigh;
	
	@FindBy(how = How.CSS, using = ".shopping_cart_badge")
	public static WebElement shoppingCartBadge;
	
	
	
	public AjoutProduitHighPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Methods */
	
	public void boutonAddProdHigh() {
		boutonAddProdHigh.click();
	}
	
	public void nbrProduit() {
		String nbrProduit = shoppingCartBadge.getText();
		Assert.assertEquals("1", nbrProduit);
		System.out.println(nbrProduit);
	

}
}
