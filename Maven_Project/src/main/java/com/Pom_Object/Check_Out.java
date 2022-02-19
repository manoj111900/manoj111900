package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Out {
	
	public WebDriver driver;
	
	@FindBy(xpath="//td[@class='cart_description']")
	private WebElement check;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement checkout;

	public Check_Out(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCheck() {
		return check;
	}	
	
	public WebElement getCheckout() {
		return checkout;
	}

}
