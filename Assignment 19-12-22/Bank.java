package com.java.demo;
import java.util.Scanner;
public class Bank
{
	public static int deposite(int a, int b)
	   {
		   int result = a+b;
		   System.out.println("New Balance"+result);
		   return result;
	   }
	   public static int withdraw(int a, int b)
	   {
		   int c=0;
		   if(a>b)
		   {
			   c = a-b;
			   System.out.println("remaining amount is:" +c);
		   }
		   else
		   {
			   System.out.println("cannot proceed");
		   }
		   return c;
	   }
    public static void main(String[] args)
	{
       int choice;
       Scanner sc = new Scanner(System.in);
	   System.out.println("Please Select an option below:");
	   System.out.println("Press 1 to Deposit Amount.");
	   System.out.println("Press 2 to Withdraw Amount.");
	   System.out.println("Press any key to Exit");
	   choice = sc.nextInt();
	   switch (choice) 
	   {
	   case 1:
		   System.out.println("Enter your current balane:");
		   int num1 = sc.nextInt();
		   System.out.println("Enter deposite amount:");
		   int num2 = sc.nextInt();
		   int res1= Bank.deposite(num1, num2);
		  break;
	   case 2:
		   System.out.println("Enter your current balane:");
		   int num3 = sc.nextInt();
		   System.out.println("Enter withdraw amount:");
		   int num4 = sc.nextInt();
		   int res2= Bank.withdraw(num3, num4);
		   System.out.println("remaining amount is "+"="+ res2);
	       break;    
	   }
  }	
}
