package org.tcs;

public class Keywords {
	int a=15;
	public static void main(String[] args) {
		System.out.println("Main Method");
		Keywords s=new Keywords();
		s.Keywords();
		System.out.println(s.a);
		
	}
	public void Keywords() {
		System.out.println("Method");
	}
	public Keywords() {
		System.out.println("constructor");
	}
	static {
		System.out.println("Static Block");
	}
}


