package org.tcs;

public class Armstrong {
	static int a,ans,n;
	public static void main(String[] args) {
		int b=153;
		n=b;
		while (n>0) {
			a=n%10;
			ans=ans+(a*a*a);
			n=n/10;
		}
		if (n==ans) {
			System.out.println("Armstrong Number");
			
		} else {
			System.out.println("Not a Armstrong Number");

		}
	}

}
