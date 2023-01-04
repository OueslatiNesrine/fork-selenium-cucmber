package com.e2etests.automation.orangeHRM.admin.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.Setup;

public class AdminPage {

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	public static WebElement admin;

	//  //input[@class='oxd-input oxd-input--active']
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	public static WebElement usernameField; 

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btnSearch;

	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")
	public static WebElement btnReset;

	public AdminPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	// Methods
	public void clickOnAdmin() throws InterruptedException {
		Thread.sleep(4000);
		admin.click();
		Thread.sleep(4000);
	}

	public void fillUsername(String name) {
		usernameField.sendKeys(name);
	}

	public void clickOnBtnSearch() {
		btnSearch.click();
	}

	public void clickOnBtnReset() {
		btnReset.click();
	}
}
