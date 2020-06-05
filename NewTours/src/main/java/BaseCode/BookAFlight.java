package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.page.object.model.BookAFlightPage;

public class BookAFlight {
	static WebDriver driver;
	public static WebDriver getBookAFlightPage(WebDriver driver) {
		BookAFlightPage bfp = new BookAFlightPage(driver);
	
	
//	driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Eezee");			
//	
//	driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("John");			
//	
//	driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("122245575223");			
//	
//	driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("something");			
//	
//	driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("S");			
//	
//	driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("NAB");			
//	
//	driver.findElement(By.xpath("//input[@name='buyFlights']")).click();			
//	
//	driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();

	return driver;
}
}
