package com.sele.ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		WebElement sign=driver.findElement(By.xpath("//span[text()='Sign up']"));
		Thread.sleep(3000);
		sign.click();
		
		WebElement mob=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Thread.sleep(5000);
		mob.sendKeys("man123@gmail.com");
		
//		WebElement name=driver.findElement(By.xpath("//input[@autocapitalize='sentences']"));
//		Thread.sleep(3000);
//		name.sendKeys("abcd");
//		
//		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
//		Thread.sleep(3000);
//		user.sendKeys("efgh");
//		
//		WebElement pass=driver.findElement(By.xpath("//span[text()='Password']"));
//		Thread.sleep(3000);
//		pass.sendKeys("12345678");
		
//		WebElement mob=driver.findElement(By.xpath("//input[@autocomplete='tel']"));
//		mob.sendKeys("man123@gmail.com");
		

		

 }
}
