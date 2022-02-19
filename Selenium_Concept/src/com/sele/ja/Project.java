package com.sele.ja;
	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
public class Project {
	public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");		
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("http://automationpractice.com/");
		    
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
		    WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		    sign.click();
		    
		    WebElement mail = driver.findElement(By.id("email"));
		    mail.sendKeys("manoj123@gmail.com");
		    
		    WebElement pass = driver.findElement(By.id("passwd"));
		    pass.sendKeys("12345");
		    
		    WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		    submit.click();
	}
}
	
