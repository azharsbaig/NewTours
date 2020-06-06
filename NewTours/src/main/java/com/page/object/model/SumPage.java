package com.page.object.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SumPage {
	public SumPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[contains(text(),'$')])[1]")
	private WebElement totaltax;	

	@FindBy(xpath="(//*[contains(text(),'$')])[2]")
	private WebElement totalprice;
	
	@FindBy(xpath="(//*[@href='mercurysignoff.php'])[2]")
	private WebElement logOutBtn;	

	public WebElement getTotaltax() {
		return totaltax;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}	

}
