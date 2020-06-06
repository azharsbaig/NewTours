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
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	private WebElement meal;
	
	@FindBy(xpath="//select[@name='creditCard']")
	private WebElement card;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement CCard;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_mn']")
	private WebElement expDate;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_yr']")
	private WebElement expYear;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	private WebElement CFirst;
	
	@FindBy(xpath="//input[@name='cc_mid_name']")
	private WebElement CMidd;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	private WebElement CLast;	
	
	@FindBy(xpath="//input[@name='billAddress1']")
	private WebElement address;

	@FindBy(xpath="//input[@name='billCity']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='billState']")
	private WebElement state;

	@FindBy(xpath="//input[@name='billZip']")
	private WebElement zip;
	
	@FindBy(xpath="//select[@name='billCountry']")
	private WebElement country;	

	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement saba;	
	
	@FindBy(xpath="//input[@name='delAddress1']")
	private WebElement deladd;
	
	@FindBy(xpath="//input[@name='delCity']")
	private WebElement delcity;
	
	@FindBy(xpath="//input[@name='delState']")
	private WebElement delstate;
		
	@FindBy(xpath="//input[@name='delZip']")
	private WebElement delzip;
		
	@FindBy(xpath="//select[@name='delCountry']")
	private WebElement delcountry;		

	@FindBy(xpath="//input[@type='image']")
	private WebElement purchBtn;	
	
	public WebElement getFirst() {
		return First;
	}

	public WebElement getLast() {
		return Last;
	}
	
	public WebElement getMeal() {
		return meal;
	}
	
	public WebElement getCard() {
		return card;
	}

	public WebElement getCCard() {
		return CCard;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getExpYear() {
		return expYear;
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
	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}
	
	public WebElement getState() {
		return state;
	}

	public WebElement getZip() {
		return zip;
	}

	public WebElement getCountry() {
		return country;
	}
	
	public WebElement getSaba() {
		return saba;
	}
	
	public WebElement getDeladd() {
		return deladd;
	}

	public WebElement getDelcity() {
		return delcity;
	}

	public WebElement getDelstate() {
		return delstate;
	}

	public WebElement getDelzip() {
		return delzip;
	}

	public WebElement getDelcountry() {
		return delcountry;
	}	

	public WebElement getPurchBtn() {
		return purchBtn;
	}	
	
}
