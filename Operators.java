package com.operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		i=20;
		j=2;
		int preincrement = ++i;//Pre Increment
		int postincrement=j++; //Post Increment
		
		k=++i + j++;     // 21 + 2
		int m = ++i + ++j;
		System.out.println("Value of k= "+k);
		System.out.println("Value of m= "+m);
		System.out.println(preincrement);
		System.out.println(postincrement);

		/********************************************Ternary Operator****************************************************/
		Scanner sc=new Scanner(System.in);
		int num1,num2,largestof3,num3,largestof4,num4;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();		
//		largestof3 = (num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
//		System.out.println("THE largest of 3 IS "+largestof3);
//		
		largestof4 = (num1>num2 && num1>num3 && num1>num4)?num1:(num2>num1 && num2>num3 && num2>num4)?num2:(num3>num1 && num3>num2 && num3>num4)?num3:num4;
		System.out.println("THE largest of 4 IS "+largestof4);

	
	}

}

