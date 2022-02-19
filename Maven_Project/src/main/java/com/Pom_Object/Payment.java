package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(id="center_column")
	private WebElement price;

	public Payment(WebDriver driver2) {
		this.driver=driver2;
        PageFactory.initElements(driver,this);
	}

	public WebElement getPrice() {
		return price;
	}

}
