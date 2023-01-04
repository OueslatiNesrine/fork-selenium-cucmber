package com.e2etests.automation.swaglabs.page_objects;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.e2etests.automation.utils.ConfigFileReader;

import com.e2etests.automation.utils.Setup;

public class SelectPageObject {
	
	public ConfigFileReader configFileReader;
	

	/* @FindBy */
	
	@FindBy(how = How.CSS, using = ".product_sort_container")
	public static WebElement select;
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div/text()[2]")
	//public static WebElement priceHL;
	
	public SelectPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Methods */
	
	public void priceHL() {
		String actuallUrl = Setup.getDriver().getCurrentUrl();
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", actuallUrl);
		System.out.println(actuallUrl);
		}
	
	
}
