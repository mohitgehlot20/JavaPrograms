package com.operators;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        if (num1>num2)
        {
        	System.out.println(num1 +" is greater than "+ num2);
        }
        else
        {
        	System.out.println(num2 +" is greater than "+ num1);
        }
	}

}
