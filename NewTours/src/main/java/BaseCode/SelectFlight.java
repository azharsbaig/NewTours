package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.SelectFlightPage;
import com.utils.Highlighter;

public class SelectFlight {
	static WebDriver driver;

	public static WebDriver getSelectFlightPag(WebDriver driver) {
		SelectFlightPage sf = new SelectFlightPage(driver);

		new Highlighter().getcolor(driver, sf.getDepFlight(), "green", "red");
		sf.getDepFlight().click();

		new Highlighter().getcolor(driver, sf.getRetFlight(), "green", "red");
		sf.getRetFlight().click();

		new Highlighter().getcolor(driver, sf.getResFlight(), "green", "red");
		sf.getResFlight().click();

		return driver;
	}
}