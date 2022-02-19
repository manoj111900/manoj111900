package com.properties;

import com.connecting.Configure;

public class File_Reader {
	
	private File_Reader() {
		
	}
	
	public static File_Reader getinstancefile() {
	File_Reader r=new File_Reader();
	return r;
	}
	
	public Configure getInstanceconfigure() throws Throwable {
		Configure f=new Configure();
		return f;
	}

}
