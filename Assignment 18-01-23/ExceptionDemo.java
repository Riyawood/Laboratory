package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo 
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in)
		try(Scanner sc = new Scanner(System.in)) //try with resource
		//if we put the scanner inside the try then it will automatically get closed
		{
			try
			{
				int a,b;
				System.out.println("Enter 1st value");
				a= sc.nextInt();
				System.out.println("Enter 2nd value");
				b= sc.nextInt();
				System.out.println("Result: "+(a/b));
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("Rest of code:");
			int arr[] = new int[5];
			arr[5]=90;
			System.out.println("Added value: "+arr[5]);
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception occured: Index out of bounds");
		}
		//finally block is the last block/closing block which will always get executed
		finally
		{
			System.out.println("Finally block always gets executed. ");
		}
	}
}
