package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Billing 
{
	static ArrayList<Bill> list = new ArrayList<Bill>();
	static Scanner sc = new Scanner(System.in);
	private static String gst;
	
	static void order(String fname, int amt)
	{
		System.out.println("Enter the quantity for "+fname+" :");
		int qty = sc.nextInt();
		list.add(new Bill(fname, qty, qty*amt));
	}
	
	static void cont()
	{
		System.out.println("Do you want to continue: y/n");
		char ch = sc.next().charAt(0);
		if((ch!='y')&&(ch!='Y'))
		{
			System.out.println();
			//print total bill
			
			System.out.println("DO you have a coupon? y/n");
			ch=sc.next().charAt(0);
			if(ch=='y')
			{
				coupon();
			}
			else
			{
				totalbill();
			}
			System.exit(0);
		}
	}
	
    static void coupon()
    {
	   String coup1="123456";
	   String coup2="code123";
	   String coup3="dis123";
	   sc.nextLine();
	   System.out.println("Enter the coupon code:");
	   String code = sc.next();
	   if((code.equals(coup1))||(code.equals(coup2))||(code.equals(coup3)))
	   {
	     System.out.println("BILL");
	     System.out.println("==============================");
	     System.out.println("ITEMS\t\t\tQTY\tAMOUNT");
	     System.out.println("==============================");
		 double total = 0.0;
		 for(Bill i: list)
		 {
			System.out.println(i.fname+" \t"+i.qty+"\t"+i.amt);
		    total = total + i.amt;
		 }
		 System.out.println();
		 System.out.println("Amount:\tRs. "+total);
		 double gst = total*0.05;
		 System.out.println("GST:\tRs. "+gst);
		 System.out.println("---------------------");
		 double famount = gst + total;
		 System.out.println("Total Amount:\tRs. "+famount);
		 double dist = famount * 0.1;
		 System.out.println("Discount Amount:\tRs. "+dist);
		 System.out.println("Total after discount:Rs. "+(famount-dist));
		 System.exit(0);
	   }
    }
	
    static void totalbill()
	{
		System.out.println("BILL");
		System.out.println("=====");
		System.out.println("ITEMS\t\t\tQTY\tAMOUNT");
		System.out.println("==============================");
		double total = 0.0;
		for(Bill i: list)
		{
			System.out.println(i.fname+" \t"+i.qty+"\t"+i.amt);
			total = total + i.amt;
		}
		
		System.out.println();
		System.out.println("Amount:\tRs. "+total);
		double gst = total*0.05;
		System.out.println("GST:\tRs. "+gst);
		System.out.println("---------------------");
		double famount = gst + total;
		System.out.println("Total Amount:\tRs. "+famount);
    }
}
