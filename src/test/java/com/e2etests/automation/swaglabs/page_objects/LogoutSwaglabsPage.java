package com.e2etests.automation.swaglabs.page_objects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LogoutSwaglabsPage {
	public ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement boutonBurger;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement boutonLogOut;
	
	public LogoutSwaglabsPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/* Methods */
	
	public void boutonBurger() {
		boutonBurger.click();
	}

	public void boutonLogOut() {
		//javascript executer click button submit
				
				JavascriptExecutor executor = (JavascriptExecutor) Setup.getDriver();
				executor.executeScript("arguments[0].click();",boutonLogOut);
		
	}

	

}
