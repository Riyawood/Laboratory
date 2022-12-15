//WAP to check whether a number is an Divisible or not.
package com.java.demo;
import java.util.Scanner;
public class Divisible 
{
	public static void main(String[] args)
	{
		int num;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a Number:");
	      num = sc.nextInt();
	      if(num%5==0 && num%11==0)
	      {	  
	         System.out.println("The Number is divisible");	
	      }
	      else 
	      {  
	    	 System.out.println("The Number is not divisible");  
		  }
	 }
}
