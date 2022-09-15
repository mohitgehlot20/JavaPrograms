package com.oops.edu;

import java.util.Scanner;

class StudentP{
	
	 String sname;
	 float m1; 
	 float m2; 
	 float sum;
	 float average;
//	 String email;
	
	 
	  void StudentinputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  student name");
		sname=sc.nextLine();
		System.out.println("Enter Marks 1");
		m1=sc.nextFloat();
		System.out.println("Enter Marks 2");                  
		m2=sc.nextFloat();
		    	
//		email=sc.next();
	}
	
	public void StudentDisplay() {
		System.out.println("Name="+sname);
		System.out.println("Marks1="+m1);
		System.out.println("Marks2="+m2);
		sum=m1+m2;
		average=(m1+m2)/2;
		System.out.println("sum of marks="+sum);
		System.out.println("Average of marks="+average);
		
		
	}
}

public class StudentOOPS {

	public static void main(String[] args) {
		
		StudentP s1=new StudentP(); 
		s1.StudentinputData();
		s1.StudentDisplay();
	
		


	}
}


