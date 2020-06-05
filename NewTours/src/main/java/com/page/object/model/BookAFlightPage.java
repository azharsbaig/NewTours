package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlightPage {
	public BookAFlightPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='passFirst0']")
	private WebElement First;
	
	@FindBy(xpath="//input[@name='passLast0']")
	private WebElement Last;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement CCard;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	private WebElement CFirst;
	
	@FindBy(xpath="//input[@name='cc_mid_name']")
	private WebElement CMidd;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	private WebElement CLast;
	
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement purchBtn;

	public WebElement getFirst() {
		return First;
	}

	public WebElement getLast() {
		return Last;
	}

	public WebElement getCCard() {
		return CCard;
	}

	public WebElement getCFirst() {
		return CFirst;
	}

	public WebElement getCMidd() {
		return CMidd;
	}

	public WebElement getCLast() {
		return CLast;
	}

	public WebElement getPurchBtn() {
		return purchBtn;
	}
	
	
	

//	Addr = 
//	City = 
//	StPro = 
//	ZipCd = 
//	Country =
//

}
