package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.locators.PageLocators;

public class AccountsPage {
	
	private WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccountSectionCount() {
		return driver.findElements(PageLocators.accountSections).size();
	}
	
	public List<String> getAccountsSectionsList() {
		
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountHeaderList = driver.findElements(PageLocators.accountSections);
		
		for(WebElement e:accountHeaderList) {
			String text = e.getText();
			System.out.println(text);
			
			accountsList.add(text);
		}
		return accountsList;
	}
	

}
