//To automate all the fields on Registratrion page of Magento web site.
package com.ibm.seleniumconcepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	// Declaration of Main method
	public static void main(String[] args) {

		// Setting Chrome Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Implementing implilcit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		// Launching the web site
		driver.get("http://magento.com");

		// Locating the web element user icon
		WebElement myAccountElt = driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		myAccountElt.click();

		// Locating the Register button
		WebElement registerElt = driver.findElement(By.xpath("//button[@type='button']"));
		registerElt.click();

		// Locating firstname text box element
		WebElement firstnameElt = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstnameElt.sendKeys("Srinivas");

		// Locating lastname text box element
		WebElement lastnameElt = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastnameElt.sendKeys("Thatikonda");

		// Locating email-address text box element
		WebElement emailElt = driver.findElement(By.xpath("//input[@id='email_address']"));
		emailElt.sendKeys("srinivas.nirmal@gmail.com");

		// Locating country dropdown element
		WebElement countryElt = driver.findElement(By.xpath("//select[@id='country']"));
		Select selectCountry = new Select(countryElt);
		selectCountry.selectByVisibleText("India");

		// Locating My company dropdown element
		WebElement companyElt = driver.findElement(By.xpath("//select[@name='company_type']"));
		Select selectCompany = new Select(companyElt);
		selectCompany.selectByValue("analyst_media");

		// Locating My role dropdown element
		WebElement roleElt = driver.findElement(By.xpath("//select[@name='individual_role']"));
		Select selectRole = new Select(roleElt);
		selectRole.selectByVisibleText("Technical/developer");

		// Locating password text box element
		WebElement passwordElt = driver.findElement(By.xpath("//input[@id='password']"));
		passwordElt.sendKeys("Sreeram123*");

		// Locating confirm password text box element
		WebElement confirmElt = driver.findElement(By.xpath("//input[@id='confirmation']"));
		confirmElt.sendKeys("Sreeram123*");

		// Locating Agree Terms check box
		WebElement agreeElt = driver.findElement(By.xpath("//input[@id='agree_terms']"));
		agreeElt.click();

	}

}// End of Program
