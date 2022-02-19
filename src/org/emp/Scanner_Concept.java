package org.emp;
import java.util.Scanner;

public class Scanner_Concept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the StudentId: ");
		String studId=sc.nextLine();
		System.out.println(studId);
		
		System.out.println("Enter the StudentName: ");
		String studName=sc.nextLine();
		System.out.println(studName);
		
		System.out.println("Enter the mark1: ");
		int m1=sc.nextInt();
		System.out.println(m1);
		
		System.out.println("Enter the mark2: ");
		int m2=sc.nextInt();
		System.out.println(m2);
		
		System.out.println("Enter the mark3: ");
		int m3=sc.nextInt();
		System.out.println(m3);
		
		System.out.println("Enter the mark4: ");
		int m4=sc.nextInt();
		System.out.println(m4);
		
		System.out.println("Enter the mark5: ");
		int m5=sc.nextInt();
		System.out.println(m5);
		
		int sum = m1+m2+m3+m4+m5;
		System.out.printf("sum=%d",sum);
		
		float avg=sum/5;
		System.out.printf("\navg=%f",avg);
	}

}
