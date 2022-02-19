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

public class Automation_Practice {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://automationpractice.com/");   
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    TakesScreenshot src= ((TakesScreenshot)driver);
		File Scr=src.getScreenshotAs(OutputType.FILE);
		File sc=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\web.png");
		FileUtils.copyFile(Scr, sc);
		
		WebElement shirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		shirt.click();
		
		File Scr1=src.getScreenshotAs(OutputType.FILE);
		File sc1=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\t-shirt.png");
		FileUtils.copyFile(Scr1, sc1);
		
		WebElement s = driver.findElement(By.xpath("//ul[@class='product_list grid row']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",s);
		
		File Scr11=src.getScreenshotAs(OutputType.FILE);
		File sc11=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\scroll.png");
		FileUtils.copyFile(Scr11, sc11);
		
		WebElement clickmore = driver.findElement(By.xpath("//span[text()='More']"));
		clickmore.click();
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select a=new Select(size);
		a.selectByValue("2");
		
		WebElement add = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		add.click();
		
		File Scr2=src.getScreenshotAs(OutputType.FILE);
		File sc2=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\add.png");
		FileUtils.copyFile(Scr2, sc2);
		
		WebElement proceed = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
		proceed.click();
		
		File Scr3=src.getScreenshotAs(OutputType.FILE);
		File sc3=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\proceed.png");
		FileUtils.copyFile(Scr3, sc3);
		
		WebElement s1 = driver.findElement(By.xpath("//td[@class='cart_description']"));
		js.executeScript("arguments[0].scrollIntoView();",s1);
		
		File Scr4=src.getScreenshotAs(OutputType.FILE);
		File sc4=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\s1.png");
		FileUtils.copyFile(Scr4, sc4);
		
		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
    	sign.click();

		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("manoj167@gmail.com");
		
		File Scr12=src.getScreenshotAs(OutputType.FILE);
		File sc12=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\mail.png");
		FileUtils.copyFile(Scr12, sc12);

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
		
		File Scr5=src.getScreenshotAs(OutputType.FILE);
		File sc5=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\year.png");
		FileUtils.copyFile(Scr5, sc5);

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
		
		File Scr6=src.getScreenshotAs(OutputType.FILE);
		File sc6=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\reg.png");
		FileUtils.copyFile(Scr6, sc6);

		WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
		reg.click();
		
		WebElement check = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		js.executeScript("arguments[0].click();", check);
		
		File Scr7=src.getScreenshotAs(OutputType.FILE);
		File sc7=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\check.png");
		FileUtils.copyFile(Scr7, sc7);

		WebElement Check = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		js.executeScript("arguments[0].click();", Check);
		
		File Scr8=src.getScreenshotAs(OutputType.FILE);
		File sc8=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\Check.png");
		FileUtils.copyFile(Scr8, sc8);

		WebElement s8 = driver.findElement(By.xpath("//div[@class='order_carrier_content box']"));
		js.executeScript("arguments[0].scrollIntoView();", s8);

		WebElement agree = driver.findElement(By.xpath("//input[@name='cgv']"));
		agree.click();
		
		File Scr9=src.getScreenshotAs(OutputType.FILE);
		File sc9=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\agree.png");
		FileUtils.copyFile(Scr9, sc9);

		WebElement Check1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		js.executeScript("arguments[0].click();", Check1);

		WebElement s10 = driver.findElement(By.id("center_column"));
		js.executeScript("arguments[0].scrollIntoView();", s10);
		
		File Scr10=src.getScreenshotAs(OutputType.FILE);
		File sc10=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\check1.png");
		FileUtils.copyFile(Scr10, sc10);

	}
}