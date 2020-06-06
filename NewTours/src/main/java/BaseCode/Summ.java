package BaseCode;

import org.openqa.selenium.WebDriver;

import com.page.object.model.SumPage;
import com.utils.Highlighter;

public class Summ {
	static WebDriver driver;

	public static WebDriver SummPage(WebDriver driver) {
		SumPage summry = new SumPage(driver);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		System.out.println("Total Tax = " + summry.getTotaltax().getText());

		System.out.println("Total Tax = " + summry.getTotalprice().getText());
		
		new Highlighter().getcolor(driver, summry.getLogOutBtn(), "green", "red");
		summry.getLogOutBtn().click();	

		return driver;

	}

}
