package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1 extends Base_Class {
		public void browserlaunch() {
		WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		clickbutton(sign);

		WebElement mail = driver.findElement(By.id("email_create"));
		sendelement(mail,"manoj16783@gmail.com");
		
		WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		clickbutton(create);

		WebElement value = driver.findElement(By.id("id_gender1"));
		clickbutton(value);

		WebElement fname = driver.findElement(By.id("customer_firstname"));
		sendelement(fname,"manoj");

		WebElement lname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		sendelement(lname,"kumar");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		sendelement(pass,"12345678");

		WebElement day = driver.findElement(By.xpath("//select[@name='days']"));
		selectvalue(day,"2");

		WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
		selectvisible(month,"May ");

		WebElement year = driver.findElement(By.xpath("//select[@name='years']"));
		selectvalue(year,"2016");
		
//		File Scr5=src.getScreenshotAs(OutputType.FILE);
//		File sc5=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\pic\\year.png");
//		FileUtils.copyFile(Scr5, sc5);

		WebElement sign1 = driver.findElement(By.id("newsletter"));
		clickbutton(sign1);

		WebElement Click = driver.findElement(By.id("optin"));
		clickbutton(Click);

		WebElement Company = driver.findElement(By.id("company"));
		sendelement(Company,"tcs");

		WebElement Address = driver.findElement(By.id("address1"));
		sendelement(Address,"37,main street");

		WebElement City = driver.findElement(By.xpath("//input[@name='city']"));
		sendelement(City,"chennai");

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		selectvisible(state,"New York");

		WebElement post = driver.findElement(By.xpath("//input[@name='postcode']"));
		sendelement(post,"00000");

		WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
		selectvisible(country,"United States");

		WebElement phone = driver.findElement(By.id("phone_mobile"));
		sendelement(phone,"9586755679");

		WebElement Alias = driver.findElement(By.id("alias"));
		sendelement(Alias,"N/A");
		
		WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
		clickbutton(reg);
		
	}
}
