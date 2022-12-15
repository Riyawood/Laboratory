//WAP to check whether a character is an vowel or Consonant.
package com.java.demo;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		char c;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a character:");
	      c = sc.next().charAt(0);
	      if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
	      {	  
	         System.out.println("The character is Vowel");	
	      }
	      else 
	      {  
	    	 System.out.println("The character is not Consonant");  
		  }
	   }
	}
