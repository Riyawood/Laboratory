package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "Hi";
		int a,b;
		try 
		{
//			System.out.println("Enter first digit:");
//			a=sc.nextInt();
//			System.out.println("Enter second digit:");
//			b=sc.nextInt();
//			int c = a/b;
//			System.out.println("Result: "+c);
			System.out.println("Length of string: "+ str.length());
			int i= Integer.parseInt(str);
		}
		catch(ArithmeticException e)
		{
//			System.out.println("You cannot divide a number by zero!!");
			System.out.println("Exception occured:"+ e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception occured: "+e.getMessage());
		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("Exception occured: "+e.getMessage());
//		    System.out.println("You cannot convert a String into integer");
//		}
		//Exception is like the parent class which contains all the exceptions
		//If you don't know which exception is to be used we can simply do the below
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e.getMessage());
		}
		System.out.println("Rest of code:");
		int x=30, y=50;
		System.out.println("Addition: "+(x+y));
	}
}
