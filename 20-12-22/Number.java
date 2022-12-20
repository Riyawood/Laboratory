package oops;
import java.util.Scanner;
public class Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, temp, i;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		temp=n;
	System.out.println();
	System.out.println("Using while loop");
	int count=0;
	    while(n!=0)
		{
		   n = n/10;
		   count++;
	    }
    System.out.println("Number of digits is: " +count);
 }
}
