package com.java.demo;
import java.util.Scanner;
public class Calculator
{
   public static int addition(int a, int b)
   {
	   int result = a+b;
	   return result;
   }
   public static int substraction(int a, int b)
   {
	   int c;
	   if(a>b)
	   {
		   c = a-b;
	   }
	   else
	   {
		   c =b-a;
	   }
	   return c;
   }
   public static void main(String[] args)
   {
	 int choice,num1,num2,res;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Which operation do you want to perform");
	 System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
	 choice = sc.nextInt();
	 switch (choice) 
	 {
	 case 1:
		System.out.println("Enter first number:");
	    num1 = sc.nextInt();
		System.out.println("Enter second number:");
	    num2 = sc.nextInt();
	    res= Calculator.addition(num1, num2);
	    System.out.println(num1+" + "+num2+" = "+res);
	   break;
	  case 2:
		   System.out.println("Enter first number:");
		   num1 = sc.nextInt();
		   System.out.println("Enter second number:");
		   num2 = sc.nextInt();
		   res = Calculator.substraction(num1, num2);
		   System.out.println("Substraction result is: "+res);
	       break; 
	  
	   }
	}
}
