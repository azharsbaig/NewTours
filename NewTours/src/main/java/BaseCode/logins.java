package BaseCode;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BasicConfig;
import com.page.object.model.LoginsPage;
import com.utils.Highlighter;

public class logins {
	static WebDriver driver;
	
	public static WebDriver getlogins() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");	
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);	
	
	driver=new ChromeDriver();
	
	driver.get(BasicConfig.getconfig("URL"));
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	LoginsPage logins = new LoginsPage(driver);
	
	new Highlighter().getcolor(driver, logins.getEmail(), "green", "red");
	logins.getEmail().sendKeys(BasicConfig.getconfig("email"));
	
	new Highlighter().getcolor(driver, logins.getPass(), "green", "red");
	logins.getPass().sendKeys(BasicConfig.getconfig("pass"));
	
	new Highlighter().getcolor(driver, logins.getSignin(),"green", "red");
	logins.getSignin().click();
	
	
	
	return driver;
	

}
}