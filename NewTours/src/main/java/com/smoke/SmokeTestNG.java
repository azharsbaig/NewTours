package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseCode.BookAFlight;
import BaseCode.FlightFind;
import BaseCode.SelectFlight;
import BaseCode.Summ;
import BaseCode.logins;

public class SmokeTestNG {

	public class SanityTestNG {
		
		WebDriver driver;
			
		@BeforeTest
		public void setup() throws Throwable {		
			driver = logins.getlogins();
		}
			
		@Test
		public void SmokeTest() throws Throwable {
			FlightFind.getFlightFindPage(driver);
		}
			
		@Test
		public void SmokeTest2() {
			SelectFlight.getSelectFlightPag(driver);
		}
		@Test
		public void SmokeTest3() throws Throwable {
			BookAFlight.getBookAFlightPage(driver);
			
		}
		@Test
		public void SmokeTest4() {
			Summ.SummPage(driver);
		}
		@AfterTest
		public void complete() {
			driver.quit();
		}

	}

}
