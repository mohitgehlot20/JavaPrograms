import java.util.Scanner;

public class MenuDrivenProgramMain {

	public static void main(String[] args) {
		int choice;
		float num1,num2,res;
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
		System.out.println("*********MENU*****************");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 
		 System.out.println("Enter 2 numbers");
		 num1=sc.nextFloat();
		 num2=sc.nextFloat();
		 
		 switch(choice) {
		 case 1: res=num1+num2;
		          System.out.println("sum of "+num1+" and "+num2+" is "+res);
		          break;
		 case 2:res=num1-num2;
		 		System.out.println("difference of "+num1+" and "+num2+" is "+res);
		 		break;
		 case 3:res=num1*num2;
	 		System.out.println("product of "+num1+" and "+num2+" is "+res);
	 		break;
		 case 4: if(num2==0) {
			     System.out.println("Divide by zero error");
 		        }
		   else {
			    res=num1/num2;
			    System.out.println("Quotient of "+num1+" and "+num2+" is "+res);
			    
		 }
		 break;
		 default:
			  System.out.println("Invalid input");
		 
		   
		 } //switch
		 System.out.println("Do you want to continue (y/n)");
		 char ch=sc.next().charAt(0);
		 if(ch=='n') {
			 break;
		 } 
		 
		} //while
		System.out.println("Program is terminated");
	}

}
