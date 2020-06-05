package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.FlightFindPage;
import com.utils.Highlighter;

public class FlightFind {
	static WebDriver driver;

	public static WebDriver getFlightFindPage(WebDriver driver) {

		FlightFindPage flights = new FlightFindPage(driver);

		new Highlighter().getcolor(driver, flights.getFlights(), "green", "red");
		flights.getFlights().click();

		Select pcount = new Select(flights.getPcount());
		new Highlighter().getcolor(driver, flights.getPcount(), "green", "red");
		pcount.selectByVisibleText("3");
		
		Select fromPort = new Select(flights.getFromPort());
		new Highlighter().getcolor(driver, flights.getFromPort(), "green", "red");
		fromPort.selectByVisibleText("London");
		
		Select frommonth = new Select(flights.getFrommonth());
		new Highlighter().getcolor(driver, flights.getFrommonth(), "green", "red");
		frommonth.selectByValue("4");
		
		Select fromday = new Select(flights.getFromday());
		new Highlighter().getcolor(driver, flights.getFromday(), "green", "red");
		fromday.selectByVisibleText("16");
		
		Select airport = new Select(flights.getAirport());
		new Highlighter().getcolor(driver, flights.getAirport(), "green", "red");
		airport.selectByVisibleText("San Francisco");

		
		Select tomonth = new Select(flights.getTomonth());
		new Highlighter().getcolor(driver, flights.getTomonth(), "green", "red");
		tomonth.selectByValue("5");		
		
		Select today = new Select(flights.getToday());
		new Highlighter().getcolor(driver, flights.getToday(), "green", "red");
		today.selectByIndex(6);

		new Highlighter().getcolor(driver, flights.getfirstClass(), "green", "red");
		flights.getfirstClass().click();
				
		new Highlighter().getcolor(driver, flights.getAirLine(), "green", "red");
		
		Select airLine = new Select(flights.getAirLine());
		airLine.selectByVisibleText("Unified Airlines");			

		new Highlighter().getcolor(driver, flights.getContBtn(), "green", "red");
		flights.getContBtn().click();		

		return driver;
	}
}
