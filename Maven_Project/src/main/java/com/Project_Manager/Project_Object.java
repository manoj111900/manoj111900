package com.Project_Manager;

import org.openqa.selenium.WebDriver;
import com.Pom_Object.Add_Shirt;
import com.Pom_Object.Address;
import com.Pom_Object.Check_Out;
import com.Pom_Object.Login_Page;
import com.Pom_Object.Payment;
import com.Pom_Object.Shipping;
import com.Pom_Object.Shirt_Page;
import com.Pom_Object.Sign_In;
import com.Pom_Object.T_Shirt;

public class Project_Object {
	
	public WebDriver driver;
	
	private Sign_In sign;
	private Login_Page login;
	private T_Shirt shirt;
	private Shirt_Page view;
	private Add_Shirt add;
	private Check_Out check;
	private Address address;
	private Shipping ship;
	private Payment pay; 
	
	public Project_Object(WebDriver driver2) {
		this.driver=driver2;
	}

	public Sign_In getinstanceSign_In() {
		
		if(sign==null) {
			sign=new Sign_In(driver);
		}
		return sign;
	}
	
	public Login_Page getinstancelogin() {
		
		if(login==null) {
			login=new Login_Page(driver);
		}
		return login;
	}
	
	public T_Shirt getinstanceshirt() {
		
		if(shirt==null) {
			shirt=new T_Shirt(driver);
		}
		return shirt;
	}
	
	public Shirt_Page getinstanceshirtpage() {
		
		if(view==null) {
			view=new Shirt_Page(driver);
		}
		return view;
	}
	
	public Add_Shirt getinstanceaddshirt() {
		
		if(add==null) {
			add=new Add_Shirt(driver);
		}
		return add;
	}
	
	public Check_Out getinstancecheckout() {
		
		if(check==null) {
			check=new Check_Out(driver);
		}
		return check;
	}
	
	public Address getinstanceaddress() {
		
		if(address==null) {
			address=new Address(driver);
		}
		return address;
	}
	
	public Shipping getinstanceship() {
		
		if(ship==null) {
			ship=new Shipping(driver);
		}
		return ship;
	}
	
	public Payment getinstancepay() {
		
		if(pay==null) {
			pay=new Payment(driver);
		}
		return pay;
	}

}
