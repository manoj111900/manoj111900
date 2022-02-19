package com.sele.ja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Selenium_Concept\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String title1 = driver.getTitle();
		System.out.println(title1);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println(currentUrl1);
		driver.navigate().to("https://web.whatsapp.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.navigate().back();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.navigate().forward();
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.navigate().refresh();
	}

}
