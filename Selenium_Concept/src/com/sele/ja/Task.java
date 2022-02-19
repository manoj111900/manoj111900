package com.sele.ja;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");		
	    WebDriver driver=new ChromeDriver();
	WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	sign.click();

	WebElement mail = driver.findElement(By.id("email_create"));
	mail.sendKeys("manoj16783@gmail.com");
	
//	File Scr12=src.getScreenshotAs(OutputType.FILE);
//	File sc12=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\mail.png");
//	FileUtils.copyFile(Scr12, sc12);

	WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
	create.click();

	WebElement value = driver.findElement(By.id("id_gender1"));
	value.click();

	WebElement fname = driver.findElement(By.id("customer_firstname"));
	fname.sendKeys("manoj");

	WebElement lname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
	lname.sendKeys("kumar");

	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("12345678");

	WebElement day = driver.findElement(By.xpath("//select[@name='days']"));
	Select s6 = new Select(day);
	s6.selectByValue("27");

	WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
	Select s5 = new Select(month);
	s5.selectByVisibleText("May ");

	WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
	Select s2 = new Select(year);
	s2.selectByValue("2016");
	
//	File Scr5=src.getScreenshotAs(OutputType.FILE);
//	File sc5=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\year.png");
//	FileUtils.copyFile(Scr5, sc5);

	WebElement sign1 = driver.findElement(By.id("newsletter"));
	sign1.click();

	WebElement Click = driver.findElement(By.id("optin"));
	Click.click();

	WebElement Company = driver.findElement(By.id("company"));
	Company.sendKeys("tcs");

	WebElement Address = driver.findElement(By.id("address1"));
	Address.sendKeys("37,main street");

	WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
	City.sendKeys("chennai");

	WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
	Select s4 = new Select(state);
	s4.selectByVisibleText("New York");

	WebElement post = driver.findElement(By.xpath("//input[@name='postcode']"));
	post.sendKeys("00000");

	WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
	Select s3 = new Select(country);
	s3.selectByVisibleText("United States");

	WebElement phone = driver.findElement(By.id("phone_mobile"));
	phone.sendKeys("9568763534");

	WebElement Alias = driver.findElement(By.id("alias"));
	Alias.sendKeys("N/A");
	
//	File Scr6=src.getScreenshotAs(OutputType.FILE);
//	File sc6=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\reg.png");
//	FileUtils.copyFile(Scr6, sc6);

	WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
	reg.click();
	}
}
