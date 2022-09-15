package com.oops.edu;

import java.util.Scanner;



class StudentPersonal{
	
	String studentname;
	int studentage;
	float studentfees;
	String studentemail;
	int eng,math,sci, sosci;
	float total, avg;

	void studentInput() {//member functions
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		studentname=sc.nextLine();
		System.out.println("Enter age");
		studentage=sc.nextInt();
		System.out.println("Enter fees");
		studentfees=sc.nextFloat();
		System.out.println("Enter emailid");
		studentemail=sc.next();
		
	}
	
	void inputMarks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Marks: English, science,Maths, SocialScience");
		eng=sc.nextInt();
		sci=sc.nextInt();
		math=sc.nextInt();
		sosci=sc.nextInt();
		
	}
	void calculateTotalAverageMarks() {
		total=eng+sci+math+sosci;
		avg=total/4;
	}
	void displayTotalAvg() {
		System.out.println("Total Marks="+total);
		System.out.println("Average marks="+avg);
	}
	
	void studentDisplay() {
		System.out.println("Student Details");
		System.out.println("Name :"+studentname);
		System.out.println("age="+studentage);
		System.out.println("fees="+studentfees);
		System.out.println("email id="+studentemail);
	}
	
}

public class StudentModular {

	public static void main(String[] args) {
		//create an object of student
		//call the methods studentInput(), studentDisplay()
		
		StudentPersonal studentobj=new StudentPersonal();
		studentobj.studentInput();
		studentobj.studentDisplay();
		studentobj.inputMarks();
		studentobj.calculateTotalAverageMarks();
		studentobj.displayTotalAvg();
		
	}

}


