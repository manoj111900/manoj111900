package com.sele.ja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		int n = driver.findElements(By.tagName("iframe")).size();
		System.out.println(n);
		
		driver.switchTo().frame(0);	
		
		Thread.sleep(3000);
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='text'][1]"));		
		findElement2.sendKeys("manoj");
		
		driver.switchTo().defaultContent();
		
		WebElement Find = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		Find.click();
		
		int n1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(n1);
		
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(1);
		
		Thread.sleep(3000);
		WebElement Find1 = driver.findElement(By.xpath("//input[@type='text'][1]"));
		Find1.sendKeys("frames");
	}	
}
