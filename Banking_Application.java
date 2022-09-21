package com.caseforSwitch;

import java.util.Scanner;

class Bank{
	float amount;
	
	void Deposit(float depositamount){
		amount=amount+depositamount;
		System.out.println("Amount after deposition is ="+amount);		
	}
	
	void withdraw(float withdrawamount) {
		if (withdrawamount>amount) {
			System.out.println("INSUFFICIENT BALANCE!!!!");
			System.out.println("The Available balance in your account is  ="+amount);
		}else {
			amount=amount-withdrawamount;
			System.out.println("Balance after Withdrawal is ="+amount);
		}
	}
}

public class MenuDrivenAreaCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float depositamount,withdrawamount;
		int ch;
		Bank bobj=new Bank();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("########## MENU FOR BANK APP #########");
		System.out.println("");
		System.out.println("1.Deposit");
		System.out.println("");
		System.out.println("2.Withdraw");
		System.out.println("");
		System.out.println("Enter your Choice");
	    ch =sc.nextInt();
	    
	    //Begin Switch
	    switch(ch) {
	    	
	    case 1:System.out.println("Enter the amount to deposit");
	    depositamount=sc.nextFloat();
        bobj.Deposit(depositamount);
        break;
        
        case 2:System.out.println("Enter the amount you want to withdraw");
        withdrawamount=sc.nextFloat();
        bobj.withdraw(withdrawamount);
        break;
        
        default:System.out.println("Invalid input");
        }//End switch
	    
        System.out.println("Do you want to continue (y/n)");   //ASKING USER TO CONTINUE
        char option=sc.next().charAt(0);
        if(option=='n') { //if(option=='y'){continue;}
     	break;
}

} //END WHILE
System.out.println("THANK YOU ,YOU HAVE LOGGED OUT");
	    }
		
		

	}


