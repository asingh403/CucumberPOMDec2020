package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.locators.PageLocators;

public class ContactUsPage {

	private WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getContactUsPageTitle() {
		return driver.getTitle();
	}

	public void fillContactUsForm(String heading, String emailId, String orderReference, String message) {
		Select select = new Select(driver.findElement(PageLocators.subjectHeading));
		select.selectByVisibleText(heading);
		driver.findElement(PageLocators.email).sendKeys(emailId);
		driver.findElement(PageLocators.orderRef).sendKeys(orderReference);
		driver.findElement(PageLocators.messageText).sendKeys(message);
	}

	public void clickSend() {
		driver.findElement(PageLocators.sendButton).click();
	}

	public String getSuccessMessg() {
		return driver.findElement(PageLocators.successMessg).getText();
	}

}