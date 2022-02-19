package com.testfeb.com.FebCucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static TakesScreenshot src;

	public static WebDriver browserlaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
		}
		return driver;
	}
	public static void launchurl(String url) {
		driver.get(url);
	}
	public static void clickbutton(WebElement element) {
		element.click();
	}
	public static void sendelement(WebElement element,String name) {
		element.sendKeys(name);
	}
	public static void navigatewindow(WebElement element,String navi) {
		driver.navigate().to(navi);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void quitbutton() {
		driver.quit();
	}
	public static void closebutton() {
		driver.close();
	}
	public static void alertaccept() {
		driver.switchTo().alert().accept();
	}
	public static void alertdismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alertsend(WebElement element,String name1) {
		driver.switchTo().alert().sendKeys(name1);
		driver.switchTo().alert().accept();
	}
	public static void selectvalue(WebElement element,String name2) {
		Select s=new Select(element);
        s.selectByValue(name2);   
	}
	public static void selectvisible(WebElement element,String text) {
		Select s1=new Select(element);
		s1.selectByVisibleText(text);

	}
	public static JavascriptExecutor scrollview(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		return js;
	}
	public static JavascriptExecutor scrollclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		return js;
	}
	public static void timewait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}