//WAP to check whether a character is alphabet or digit or special character.
package com.java.demo;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
		  char c;
		  System.out.println("Enter a character:");
	      c = sc.next().charAt(0);
	      if((c>='a' && c<='z')||(c>='A' && c<='Z'))
	      {	  
	         System.out.println(c +"is an Alphabet");	
	      }
	      else if (c>='0' && c<='9')
	      {  
	    	 System.out.println(c +"is an Digit");  
		  }
	      else
	      {
	    	  System.out.println(c +"is Special Character");  
	      }
	  }
}
