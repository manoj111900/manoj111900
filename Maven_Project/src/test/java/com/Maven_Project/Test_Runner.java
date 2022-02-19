package com.Maven_Project;

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
import com.Project_Manager.Project_Object;
import com.properties.File_Reader;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver=browserlaunch("chrome");
	
	public static Project_Object pom=new Project_Object(driver);
	
	public static void main(String[] args) throws Throwable {
		
		String url = File_Reader.getinstancefile().getInstanceconfigure().geturl();
		
		launchurl(url);
		
		timewait();
		
		clickbutton(pom.getinstanceSign_In().getSignin());
		
		String email = File_Reader.getinstancefile().getInstanceconfigure().getemail();
		
		sendelement(pom.getinstancelogin().getEmailid(),email);

		String pass = File_Reader.getinstancefile().getInstanceconfigure().getpass();
		
		sendelement(pom.getinstancelogin().getPassword(),pass);

		clickbutton(pom.getinstancelogin().getSignin());
		
		clickbutton(pom.getinstanceshirt().getShirt());
		
		scrollview(pom.getinstanceshirtpage().getScroll());

		clickbutton(pom.getinstanceshirtpage().getMore());
		
		clickbutton(pom.getinstanceaddshirt().getPlus());
		
		String value = File_Reader.getinstancefile().getInstanceconfigure().getvalue();

		selectvalue(pom.getinstanceaddshirt().getSize(),value);
		
		clickbutton(pom.getinstanceaddshirt().getAdd());

		clickbutton(pom.getinstanceaddshirt().getProceed());
		
		scrollview(pom.getinstancecheckout().getCheck());

		scrollclick(pom.getinstancecheckout().getCheckout());
		
		scrollclick(pom.getinstanceaddress().getAddress());
		
		scrollview(pom.getinstanceship().getView());

		clickbutton(pom.getinstanceship().getAgree());

		scrollclick(pom.getinstanceship().getShipping());
		
		scrollview(pom.getinstancepay().getPrice());
	}
	
}
