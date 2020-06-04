package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginsPage {
	
	public LoginsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//input[@name='userName']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement signin;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}	
}