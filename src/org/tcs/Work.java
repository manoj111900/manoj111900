package org.tcs;

public class Work {
	
    int a=99;
    int b=1;
	public Work() {
		System.out.println("Default Constructor");
		
	}
	
	public Work(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add() {
		System.out.println(a+b);

	}
	public static void main(String[] args) {
		Work s=new Work();
		Work s1=new Work(99,1);
		s1.add();
	}

}
