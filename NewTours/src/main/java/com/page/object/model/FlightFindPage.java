package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightFindPage {
	public FlightFindPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
		@FindBy(xpath="//input[@value='oneway']")
		private WebElement flights;
		
		@FindBy(xpath="//select[@name='passCount']")
		private WebElement pcount;
		
		@FindBy(xpath="//select[@name='fromPort']")
		private WebElement fromPort;
		
		@FindBy(xpath="//select[@name='fromMonth']")
		private WebElement frommonth;
		
		@FindBy(xpath="//select[@name='fromDay']")
		private WebElement fromday;
		
		@FindBy(xpath="//select[@name='toPort']")
		private WebElement airport;
		
		@FindBy(xpath="//select[@name='toMonth']")
		private WebElement tomonth;
		
		@FindBy(xpath="//select[@name='toDay']")
		private WebElement today;
		
		@FindBy(xpath="//input[@value='First']")
		private WebElement contBtn;

		public WebElement getFlights() {
			return flights;
		}

		public WebElement getPcount() {
			return pcount;
		}

		public WebElement getFromPort() {
			return fromPort;
		}

		public WebElement getFrommonth() {
			return frommonth;
		}

		public WebElement getFromday() {
			return fromday;
		}

		public WebElement getAirport() {
			return airport;
		}

		public WebElement getTomonth() {
			return tomonth;
		}

		public WebElement getToday() {
			return today;
		}

		public WebElement getContBtn() {
			return contBtn;
		}		
}