package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	public SelectFlightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//input[@name='outFlight'])[4]")
	private WebElement depFlight;

	@FindBy(xpath="(//input[@name='inFlight'])[3]")
	private WebElement retFlight;
	
	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement resFlight;

	public WebElement getDepFlight() {
		return depFlight;
	}

	public WebElement getRetFlight() {
		return retFlight;
	}

	public WebElement getResFlight() {
		return resFlight;
	}	
}
