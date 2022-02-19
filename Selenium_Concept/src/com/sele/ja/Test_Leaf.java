package com.sele.ja;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Leaf {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();	
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement index = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Thread.sleep(3000);
		Select s=new Select(index);
		s.selectByIndex(1);
		
		WebElement text = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Thread.sleep(3000);
		Select s1=new Select(text);
		s1.selectByVisibleText("Appium");
		
		WebElement value = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Thread.sleep(3000);
		Select s2=new Select(value);
		s2.selectByValue("1");
		
		WebElement number = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Thread.sleep(3000);
		Select s3=new Select(number);
		List<WebElement> Get=s3.getOptions();
		for(WebElement drop:Get) {
			System.out.println(drop.getText());	
		}
		Thread.sleep(2000);
		
		WebElement s4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		s4.sendKeys("UFT/QTP");
		
		WebElement send = driver.findElement(By.xpath("//select[@multiple='']"));
		Thread.sleep(3000);
		Select s5=new Select(send);
		s5.selectByValue("1");
		s5.selectByValue("2");
		boolean mul = s5.isMultiple();
		System.out.println(mul);
		
		TakesScreenshot src= ((TakesScreenshot)driver);
		Thread.sleep(3000);
		File Scr=src.getScreenshotAs(OutputType.FILE);
		File sc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\s.png");
		FileUtils.copyFile(Scr, sc);
		
	    WebElement option = s.getFirstSelectedOption();
        System.out.println(option.getText());     		
	}
}
