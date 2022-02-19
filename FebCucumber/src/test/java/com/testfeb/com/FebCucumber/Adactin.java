package com.testfeb.com.FebCucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Adactin extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		browserlaunch("chrome");
	    driver=new ChromeDriver();
	    
	    launchurl("https://adactinhotelapp.com/");   
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
		@FindBy(id="username")
		private WebElement user;
		sendelement(user,"manoj1923");
		
		WebElement pass = driver.findElement(By.id("password"));
		sendelement(pass,"manoj1");
		
		WebElement register = driver.findElement(By.id("login"));
		clickbutton(register);
		
		WebElement location = driver.findElement(By.id("location"));
		selectvalue(location,"Sydney");
		
		WebElement Hotel = driver.findElement(By.id("hotels"));
		selectvalue(Hotel,"Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		selectvalue(room,"Double");
		
		WebElement num = driver.findElement(By.id("room_nos"));
		selectvalue(num,"3");
		
		WebElement Checkin = driver.findElement(By.id("datepick_out"));
		sendelement(Checkin,"31/01/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		selectvalue(adult,"2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		selectvalue(child,"1");
		
		WebElement search = driver.findElement(By.id("Submit"));
		clickbutton(search);
		
		WebElement select = driver.findElement(By.id("radiobutton_0"));
		clickbutton(select);
		
		WebElement Continue = driver.findElement(By.id("continue"));
		clickbutton(Continue);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		sendelement(firstname,"manoj");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		sendelement(lastname,"kumar");
		
		WebElement address = driver.findElement(By.id("address"));
		sendelement(address,"abcdefghijkl");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		sendelement(card,"123457887654321");
		
		WebElement type = driver.findElement(By.id("cc_type"));
		selectvalue(type,"VISA");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		selectvalue(month,"4");
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		selectvalue(year,"2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendelement(cvv,"321");
		
		WebElement book = driver.findElement(By.id("book_now"));
		clickbutton(book);
	}

}
