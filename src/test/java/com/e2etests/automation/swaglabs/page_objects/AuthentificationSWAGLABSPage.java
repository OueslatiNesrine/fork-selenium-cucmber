package com.e2etests.automation.swaglabs.page_objects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationSWAGLABSPage extends BasePage {

	public ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement userName;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.ID, using = "login-button")
	public static WebElement btnLogin;

	public AuthentificationSWAGLABSPage()  {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}
 
	/* Methods */
	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url.swaglabs"));
	}

	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillPassword(String pswd) {
		password.sendKeys(pswd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}
	public void verify () throws InterruptedException {
		Thread.sleep(3000);
		String actuallUrl = Setup.getDriver().getCurrentUrl();
		String url = configFileReader.getProperties("home.url.saucelabs");
		Assert.assertEquals(url, actuallUrl);
		log.error(actuallUrl);
	}

}
