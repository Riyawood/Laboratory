//WAP to check whether a character is an alphabet or not.
package com.java.demo;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char c;
	  System.out.println("Enter a character:");
      c = sc.next().charAt(0);
      if((c>='a' && c<='z')||(c>='A' && c<='Z'))
      {	  
         System.out.println("The character is an Alphabet");	
      }
      else 
      {  
    	 System.out.println("The character is not an Alphabet");  
	  }
   }
}	

