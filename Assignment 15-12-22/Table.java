//WAP to create mutliplication table.
package com.java.demo;
import java.util.Scanner;
public class Table {
   public static void main(String[] args)
   {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
		int num= sc.nextInt();
	    for(int i=1; i<=10;i++)
		{
	       System.out.println(num+"*"+i+ "="+num*i);	
	    }
	}
}
