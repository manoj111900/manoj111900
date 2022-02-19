package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shirt_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//ul[@class='product_list grid row']")
	private WebElement scroll;	

	@FindBy(xpath="//span[text()='More']")
	private WebElement more;

	public Shirt_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getScroll() {
		return scroll;
	}
	
	public WebElement getMore() {
		return more;
	}
	
}
