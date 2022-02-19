package com.sele.ja;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screeshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement mail=driver.findElement(By.xpath("//input[@name='username']"));
		mail.sendKeys("manoj123@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		Thread.sleep(5000);
		pass.sendKeys("12345678");
		
		WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(5000);
		log.click();
		
		TakesScreenshot src= ((TakesScreenshot)driver);
		Thread.sleep(3000);
		File Scr=src.getScreenshotAs(OutputType.FILE);
		File sc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\snap.png");
		FileUtils.copyFile(Scr, sc);

 
	}
}