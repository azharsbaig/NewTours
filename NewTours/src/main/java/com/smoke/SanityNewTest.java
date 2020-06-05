package com.smoke;

import org.openqa.selenium.WebDriver;

import BaseCode.FlightFind;
import BaseCode.SelectFlight;
import BaseCode.logins;

public class SanityNewTest {
public static void main(String[] args) throws Throwable {
	WebDriver driver = logins.getlogins();
	FlightFind.getFlightFindPage(driver);
	SelectFlight.getSelectFlightPag(driver);
}
}
