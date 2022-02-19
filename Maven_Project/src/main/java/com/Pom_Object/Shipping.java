package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
public WebDriver driver;
	
	@FindBy(xpath="//div[@class='order_carrier_content box']")
	private WebElement view;
	
	@FindBy(xpath="//input[@name='cgv']")
	private WebElement agree;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement shipping;

	public Shipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getView() {
		return view;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getShipping() {
		return shipping;
	}
}
