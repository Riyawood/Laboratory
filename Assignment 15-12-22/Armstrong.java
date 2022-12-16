//WAP to check whether a number is armstrong or not.
package com.java.demo;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		int num, n,temp, total=0;
		System.out.println("Enter 3 Digit Number:");
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    n=num;
	    for(;n!=0; n/=10)
	    {	
	      temp = n % 10;
	      total = total + temp * temp * temp;
	    }
	    if(total == num)
	      System.out.println(num + " is an armstrong Number");	
	    else 
	      System.out.println(num + " is not an armstrong Number");  
    }
}
