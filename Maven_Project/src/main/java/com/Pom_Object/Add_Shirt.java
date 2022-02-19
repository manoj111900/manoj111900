package com.Pom_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Shirt {
	public WebDriver driver;

	@FindBy(xpath= "//i[@class='icon-plus']")
	private WebElement plus;
		
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement add;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	private WebElement proceed;

	public Add_Shirt(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAdd() {
		return add;
	}
	
	public WebElement getProceed() {
		return proceed;
	}

}
