package exceptionhandling;

import java.util.Scanner;

public class Voting {
	
	public static void validate(int age) 
	{
			if (age>=18)
			{
				System.out.println("Person is eligible to vote:" +age);
			}
			else
				throw new VotingException("Person is not eligible to vote:" +age);
	
			}
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age:");
	    int n = sc.nextInt();
		try
		{
			validate(n);
			
		}
		catch(VotingException e)
		{
			System.out.println(e.getMessage());
		}
	}
			

}
