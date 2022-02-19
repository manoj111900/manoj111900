package com.sele.ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_Concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		WebElement Double = driver.findElement(By.xpath("//button[text()='Double Click Me']"));		
		Actions button=new Actions(driver);
		button.doubleClick(Double).build().perform();
		
		WebElement Right = driver.findElement(By.xpath("//button[text()='Right Click Me']"));		
		Actions button1=new Actions(driver);
		button1.contextClick(Right).build().perform();
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));		
		Actions button2=new Actions(driver);
		button2.click(click).build().perform();
		
	}
}
