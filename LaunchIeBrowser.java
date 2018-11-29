package com.ibm.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchIeBrowser {

	public static void main(String[] args) {

		// Setting the absolute path to load Chrome Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// WebDriver driver1=new ChromeDriver();

		// Setting the absolute path to load Chrome Driver
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		// WebDriver driver2=new FirefoxDriver();

		// Setting the absolute path to load IE Driver
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");

		// Creating object for IE Driver
		WebDriver driver3 = new InternetExplorerDriver();

	}

}
