package com.sele.ja;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://adactinhotelapp.com/");   
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
//	    TakesScreenshot src= ((TakesScreenshot)driver);
//		File Scr=src.getScreenshotAs(OutputType.FILE);
//		File sc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\adact\\web.png");
//		FileUtils.copyFile(Scr, sc);
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("manoj1923");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("manoj1");
		
		WebElement register = driver.findElement(By.id("login"));
		register.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByValue("Sydney");
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(Hotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2=new Select(room);
		s2.selectByValue("Double");
		
		WebElement num = driver.findElement(By.id("room_nos"));
		Select s3=new Select(num);
		s3.selectByValue("3");
		
		WebElement Checkin = driver.findElement(By.id("datepick_out"));
		Checkin.sendKeys("31/01/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5=new Select(child);
		s5.selectByValue("1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();
		
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("manoj");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("kumar");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("abcdefghijkl");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("123457887654321");
		
		WebElement type = driver.findElement(By.id("cc_type"));
		Select s6=new Select(type);
		s6.selectByValue("VISA");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(month);
		s7.selectByValue("4");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(year);
		s8.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("321");
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

}
