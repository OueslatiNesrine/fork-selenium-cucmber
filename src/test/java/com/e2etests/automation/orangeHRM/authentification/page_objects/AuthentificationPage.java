package com.e2etests.automation.orangeHRM.authentification.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationPage {
	
	public ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.NAME, using = "username")
	public static WebElement username;

	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btnLogin;

	public AuthentificationPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Methods */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url.orange"));
	}

	public void fillUsername(String name) {
		username.sendKeys(name);
	}

	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickOnBtnLogin() throws InterruptedException {
		btnLogin.click();
		Thread.sleep(4000);
	}

}
