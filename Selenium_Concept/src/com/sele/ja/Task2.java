package com.sele.ja;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends Task {
	@Override
	public void browserlaunch() {
		// TODO Auto-generated method stub
		super.browserlaunch();
	}

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//	  TakesScreenshot src= ((TakesScreenshot)driver);
//			File Scr=src.getScreenshotAs(OutputType.FILE);
//			File sc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\web.png");
//			FileUtils.copyFile(Scr, sc);

		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign.click();

		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("manoj16783@gmail.com");

		WebElement pass1 = driver.findElement(By.id("passwd"));
		pass1.sendKeys("12345678");

		WebElement sign1 = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		sign1.click();
		
		WebElement shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		shirt.click();

//			File Scr1=src.getScreenshotAs(OutputType.FILE);
//			File sc1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\t-shirt.png");
//			FileUtils.copyFile(Scr1, sc1);

		WebElement s = driver.findElement(By.xpath("//ul[@class='product_list grid row']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", s);

//			File Scr11=src.getScreenshotAs(OutputType.FILE);
//			File sc11=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\scroll.png");
//			FileUtils.copyFile(Scr11, sc11);

		WebElement clickmore = driver.findElement(By.xpath("//span[text()='More']"));
		clickmore.click();

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select a = new Select(size);
		a.selectByValue("2");
//			
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		add.click();

//			File Scr2=src.getScreenshotAs(OutputType.FILE);
//			File sc2=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\add.png");
//			FileUtils.copyFile(Scr2, sc2);

		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		proceed.click();

//			File Scr3=src.getScreenshotAs(OutputType.FILE);
//			File sc3=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\proceed.png");
//			FileUtils.copyFile(Scr3, sc3);
//			
		WebElement s1 = driver.findElement(By.xpath("//td[@class='cart_description']"));
		js.executeScript("arguments[0].scrollIntoView();", s1);

//			File Scr4=src.getScreenshotAs(OutputType.FILE);
//			File sc4=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\s1.png");
//			FileUtils.copyFile(Scr4, sc4);

		WebElement check = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		js.executeScript("arguments[0].click();", check);

//			File Scr7=src.getScreenshotAs(OutputType.FILE);
//			File sc7=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\check.png");
//			FileUtils.copyFile(Scr7, sc7);

		WebElement Check = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		js.executeScript("arguments[0].click();", Check);

//		File Scr8 = src.getScreenshotAs(OutputType.FILE);
//		File sc8 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\Check.png");
//		FileUtils.copyFile(Scr8, sc8);

		WebElement s8 = driver.findElement(By.xpath("//div[@class='order_carrier_content box']"));
		js.executeScript("arguments[0].scrollIntoView();", s8);

		WebElement agree = driver.findElement(By.xpath("//input[@name='cgv']"));
		agree.click();

//			File Scr9=src.getScreenshotAs(OutputType.FILE);
//			File sc9=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\agree.png");
//			FileUtils.copyFile(Scr9, sc9);

		WebElement Check1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		js.executeScript("arguments[0].click();", Check1);

		WebElement s10 = driver.findElement(By.id("center_column"));
		js.executeScript("arguments[0].scrollIntoView();", s10);

//			File Scr10=src.getScreenshotAs(OutputType.FILE);
//			File sc10=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\check1.png");
//			FileUtils.copyFile(Scr10, sc10);

	}
}
