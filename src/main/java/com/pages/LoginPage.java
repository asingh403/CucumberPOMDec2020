package com.pages;

import org.openqa.selenium.WebDriver;

import com.locators.PageLocators;

public class LoginPage {
	
	private WebDriver driver;
	
	/**
	 * I have created the locators in separate class
	 */
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behaviour) of the page the form of methods:
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgetPwdLinkExist() {
		return driver.findElement(PageLocators.forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(PageLocators.emailId).sendKeys(username);		
	}
	
	public void enterPassword(String password) {
		driver.findElement(PageLocators.password).sendKeys(password);		
	}
	
	public void clickOnLogin() {
		driver.findElement(PageLocators.signInButton).click();
	}
	
	public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with : " + un + " and " + pwd);
		
		driver.findElement(PageLocators.emailId).sendKeys(un);
		driver.findElement(PageLocators.password).sendKeys(pwd);
		driver.findElement(PageLocators.signInButton).click();
		
		return new AccountsPage(driver);
	}
	
}
