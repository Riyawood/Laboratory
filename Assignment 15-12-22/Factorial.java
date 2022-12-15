//WAP to print the factorial value from 1 to 10.
package com.java.demo;
public class Factorial 
{
  public static void main(String[] args)
  {
	  int i;
	  int fact=1;
	  System.out.println(" Number");
	  for(i=1;i<=10;i++)
	  {
		  fact*=i;
	      System.out.println("Factorial of "  + i +  " is:" + fact);			  
      }
   }
} 
