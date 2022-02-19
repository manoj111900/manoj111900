package com.connecting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configure {
	
	public Properties p;
	
	public Configure() throws Throwable {		
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\manoj\\Maven_Project\\src\\main\\java\\com\\properties\\Configuration.properties");
		FileInputStream f1=new FileInputStream(f);
		p=new Properties();
		p.load(f1);	
	}
	
	public String geturl() {
		String url=p.getProperty("url");
		return url;
	}
	
	public String getemail() {
		String email = p.getProperty("mail");
		return email;
	}
	
	public String getpass() {
		String password = p.getProperty("pass");
		return password;
	}
	
	public String getvalue() {
		String select = p.getProperty("value");
		return select;
	}
	
}
