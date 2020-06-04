package BaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TotalCodeDND {	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("selenium1994");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("smarttech");
			driver.findElement(By.xpath("//input[@name='login']")).click();			
			
			
			driver.findElement(By.xpath("//input[@value='oneway']")).click();

			WebElement pcount = driver.findElement(By.xpath("//select[@name='passCount']"));
			Select pcountobj = new Select(pcount);
			pcountobj.selectByVisibleText("3");			
			
			WebElement fromPort = driver.findElement(By.xpath("//select[@name='fromPort']"));
			Select fromPortobj = new Select(fromPort);			
			
			fromPortobj.selectByVisibleText("London");

			WebElement frommonth = driver.findElement(By.xpath("//select[@name='fromMonth']"));
			Select frommonthobj = new Select(frommonth);
			frommonthobj.selectByValue("4");			
			
			WebElement fromday = driver.findElement(By.xpath("//select[@name='fromDay']"));
			Select fromdayobj = new Select(fromday);
			fromdayobj.selectByVisibleText("16");			
			
			WebElement arrport = driver.findElement(By.xpath("//select[@name='toPort']"));
			Select arrportobj = new Select(arrport);
			arrportobj.selectByVisibleText("San Francisco");			
			
			WebElement tomonth = driver.findElement(By.xpath("//select[@name='toMonth']"));
			Select tomonthobj = new Select(tomonth);
			tomonthobj.selectByValue("5");			

			WebElement today = driver.findElement(By.xpath("//select[@name='toDay']"));
			Select todayobj = new Select(today);
			todayobj.selectByIndex(6);			

			driver.findElement(By.xpath("//input[@value='First']")).click();
			
			
			
			
			
			WebElement airl = driver.findElement(By.xpath("//select[@name='airline']"));
			Select airlobj = new Select(airl);
			airlobj.selectByVisibleText("Unified Airlines");			

			driver.findElement(By.xpath("//input[@name='findFlights']")).click();			
			
			driver.findElement(By.xpath("(//input[@name='outFlight'])[4]")).click();			
			
			driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();		
			
			driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();						
			
			driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Eezee");			
			
			driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("John");			
			
			driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("122245575223");			
			
			driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("something");			
			
			driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("S");			
			
			driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("NAB");			
			
			driver.findElement(By.xpath("//input[@name='buyFlights']")).click();			
			
			driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();

			driver.quit();
		}

	}
