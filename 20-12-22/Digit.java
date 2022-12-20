package oops;
import java.util.Scanner;
public class Digit 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   int n,firstDigit=0, lastDigit=0;
	   System.out.println("Enter a number:");
	   n = sc.nextInt();
	   
	   lastDigit= n%10;
	   System.out.println("Last digit: "+lastDigit);
		  
	  while(n!=0)
	  {
		  firstDigit = n%10;
		  n/=10;
	  }
	  System.out.println("First digit: "+firstDigit);
	}
}
