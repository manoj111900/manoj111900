package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class T_Shirt {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement shirt;

	public T_Shirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getShirt() {
		return shirt;
	}

}
