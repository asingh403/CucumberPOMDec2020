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
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	public int getAccountsSectionCount() {
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
	
	
	public String callUsNow() {
		return driver.findElement(PageLocators.callUsNow).getText();
	}
	
	public String itemSectionLinksConnect() {
		String url = "";
		
		List<WebElement> links =  driver.findElements(PageLocators.itemLinks);
		System.out.println("total Nums of links :: " + links.size());
		
		for(int i=0; i<links.size(); i++) {
			WebElement ele = links.get(i);
			
			url = ele.getAttribute("href");
			System.out.println("URL :: " + url);
		}
		return url;
	}
}
