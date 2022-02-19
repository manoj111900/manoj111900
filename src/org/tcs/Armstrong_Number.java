package org.tcs;
import java.util.Scanner;

public class Armstrong_Number {
	static int a,ans,temp;
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0) {
			a=n%10;
			ans=ans+(a*a*a);
			n=n/10;
		}
		if (temp==ans) {
			System.out.println("Armstrong Number");
			
		}else {
			System.out.println("Not a Armstrong number");
		}
	}

}
