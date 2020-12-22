package com.locators;

import org.openqa.selenium.By;

public class PageLocators {
	
	// *********** Login Page Locators ****************
	
	public static final By emailId = By.id("email");
	public static final By password = By.id("passwd");
	public static final By signInButton = By.id("SubmitLogin");
	public static final By forgotPwdLink = By.linkText("Forgot your password?");

	// *********** Accounts Page Locators ****************
	public static final By accountSections = By.cssSelector("div#center_column span");
	public static final By callUsNow = By.xpath("//*[text() = '0123-456-789']");
	public static final By itemLinks = By.xpath("//*[@class='item']/a");
	
}
