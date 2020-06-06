package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.config.BasicConfig;
import com.page.object.model.BookAFlightPage;
import com.utils.Highlighter;

public class BookAFlight {

	static WebDriver driver;

	public static WebDriver getBookAFlightPage(WebDriver driver) throws Throwable {
		BookAFlightPage bfp = new BookAFlightPage(driver);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		new Highlighter().getcolor(driver, bfp.getFirst(), "green", "red");
		bfp.getFirst().sendKeys(BasicConfig.getconfig("First"));

		new Highlighter().getcolor(driver, bfp.getLast(), "green", "red");
		bfp.getLast().sendKeys(BasicConfig.getconfig("Last"));

		Select meal = new Select(bfp.getMeal());
		new Highlighter().getcolor(driver, bfp.getMeal(), "green", "red");
		meal.selectByVisibleText("Muslim");

		Select card = new Select(bfp.getCard());
		new Highlighter().getcolor(driver, bfp.getCard(), "green", "red");
		card.selectByIndex(3);

		new Highlighter().getcolor(driver, bfp.getCCard(), "green", "red");
		bfp.getCCard().sendKeys(BasicConfig.getconfig("Cnumber"));

		Select expDate = new Select(bfp.getExpDate());
		new Highlighter().getcolor(driver, bfp.getExpDate(), "green", "red");
		expDate.selectByIndex(6);

		Select expYear = new Select(bfp.getExpYear());
		new Highlighter().getcolor(driver, bfp.getExpYear(), "green", "red");
		expYear.selectByIndex(7);

		new Highlighter().getcolor(driver, bfp.getCFirst(), "green", "red");
		bfp.getCFirst().sendKeys(BasicConfig.getconfig("CFirst"));

		new Highlighter().getcolor(driver, bfp.getCMidd(), "green", "red");
		bfp.getCMidd().sendKeys(BasicConfig.getconfig("CMid"));

		new Highlighter().getcolor(driver, bfp.getCLast(), "green", "red");
		bfp.getCLast().sendKeys(BasicConfig.getconfig("CLast"));

		bfp.getAddress().clear();
		new Highlighter().getcolor(driver, bfp.getAddress(), "green", "red");
		bfp.getAddress().sendKeys(BasicConfig.getconfig("Addr"));

		bfp.getCity().clear();
		new Highlighter().getcolor(driver, bfp.getCity(), "green", "red");
		bfp.getCity().sendKeys(BasicConfig.getconfig("City"));

		bfp.getState().clear();
		new Highlighter().getcolor(driver, bfp.getState(), "green", "red");
		bfp.getState().sendKeys(BasicConfig.getconfig("StPro"));

		bfp.getZip().clear();
		new Highlighter().getcolor(driver, bfp.getZip(), "green", "red");
		bfp.getZip().sendKeys(BasicConfig.getconfig("ZipCd"));

		Select country = new Select(bfp.getCountry());
		new Highlighter().getcolor(driver, bfp.getCountry(), "green", "red");
		country.selectByVisibleText(BasicConfig.getconfig("Country"));

		new Highlighter().getcolor(driver, bfp.getSaba(), "green", "red");
		bfp.getSaba().click();

		bfp.getDeladd().clear();
		new Highlighter().getcolor(driver, bfp.getDeladd(), "green", "red");
		bfp.getDeladd().sendKeys(BasicConfig.getconfig("Addr1"));

		bfp.getDelcity().clear();
		new Highlighter().getcolor(driver, bfp.getDelcity(), "green", "red");
		bfp.getDelcity().sendKeys(BasicConfig.getconfig("City1"));

		bfp.getDelstate().clear();
		new Highlighter().getcolor(driver, bfp.getDelstate(), "green", "red");
		bfp.getDelstate().sendKeys(BasicConfig.getconfig("StPro1"));

		bfp.getDelzip().clear();
		new Highlighter().getcolor(driver, bfp.getDelzip(), "green", "red");
		bfp.getDelzip().sendKeys(BasicConfig.getconfig("ZipCd1"));
		
		Select countries = new Select(bfp.getDelcountry());		
		new Highlighter().getcolor(driver, bfp.getDelcountry(), "green", "red");
		countries.selectByVisibleText(BasicConfig.getconfig("Country1"));

		new Highlighter().getcolor(driver, bfp.getPurchBtn(), "green", "red");
		bfp.getPurchBtn().click();			
		
		return driver;
	}
}
