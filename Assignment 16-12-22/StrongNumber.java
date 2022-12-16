package com.java.demo;
import java.util.Scanner;
public class StrongNumber 
{
    public static void main(String[] args) 
	{
		int num,temp,fact,rem,total=0;
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
	    temp=num;
	    while(num!=0)
	    {	
	      rem = num%10;
	      fact = 1;
	      for(int i=1; i<=rem; i++)
	      {
	    	  fact = fact *i;
	      }	 
	      total = total+fact;
	      num = num/10;
	    }
	    if(temp == total)
	    {	
	      System.out.println(temp + " is a Strong Number");
	    } 
	    else 
	      System.out.println(temp + " is not a Strong Number");  
	}    	    
}    
	    

