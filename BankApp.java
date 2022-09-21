package com.edu.loop;

import java.util.Scanner;

class Bank{
 float amount; //instance variable
 void deposit(float depositamount) {
	  amount=amount+depositamount;
	 System.out.println("Balance in the Bank after deposit "+amount);
 }
 void withdraw(float withdrawamount) {
	 
	 if(withdrawamount>amount) {
		 System.out.println("Insufficient Balance!!!!!!!!!!");
		 System.out.println("Available balance ="+amount);
	 }else {
		 amount=amount-withdrawamount;
		 System.out.println("After amount withdraw available balance "+amount);
	 }
   }
}

public class BankAppMain {

	public static void main(String[] args) {
		 float damount,wamount;
		 int choice;
		 Bank bobj=new Bank();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("*********MENU FOR MY BANK*************");
		System.out.println("1.To Deposit");
		System.out.println("2.To Withdraw");
		System.out.println("Enter your choice");
		 choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("Enter the amount to deposit");
		        damount=sc.nextFloat();
		        bobj.deposit(damount);
		        break;
		case 2:System.out.println("Enter the amount you want to withdraw");
		       wamount=sc.nextFloat();
		       bobj.withdraw(wamount);
		       break;
		default:System.out.println("Invalid input");
		}//switch
		System.out.println("Do you want to continue (y/n)");
		char option=sc.next().charAt(0);
		if(option=='n') { //if(option=='y'){continue;}
			break;
		}
		
		} //while
		System.out.println("EXIT");
	}

}
