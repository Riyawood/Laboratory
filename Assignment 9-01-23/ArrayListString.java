package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListString 
{
	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str;
		//alist.add("Riya");
		//System.out.println(alist);
		System.out.println("Enter the String:");
		for(int i=0;i<5;i++)
		{
			str=sc.next();
			alist.add(str);
		}
        System.out.println("String are:"+alist);
        
//        System.out.println("Printing using for loop:");
//        for (int i=0;i<alist.size();i++)
//        {
//        	System.out.println(alist.get(i));
//        }
        
        //Sorting in ascending order
        Collections.sort(alist);
        //Sorting in descending order
        Collections.sort(alist,Collections.reverseOrder());
        System.out.println("After Sorting(reverse): "+alist);
	    
        //adding a value using index
        alist.add(2,"Priya");
        System.out.println(alist);
        System.out.println("Enter the index where you want to enter astring:");
        int index = sc.nextInt();
        System.out.println("Enter the String: ");
        str = sc.next();
        alist.add(index, str);
        System.out.println(alist);
        
        //replace a string
        alist.set(0, "Pritam");
        alist.set(5, "Rahul");
        System.out.println(alist);
        
        //remove a string
        alist.remove(0);
        System.out.println("After removing index 0: "+alist);
        System.out.println(alist.remove("Arnab"));//true (it found the value and remove it)
	    System.out.println(alist.remove("Arnab"));//false (it does not find the values as it)
	
	    System.out.println("Original arraylist: "+alist);
	    ArrayList<String> alist2 = new ArrayList<String>();
	    alist.addAll(alist);
	    System.out.println("Copied arrayList: "+alist2);
	
	//convert from array to arraylist
	    String arr[]= {"Arnab","Sabdick","Suborno","Amrita","Riya"};
	    ArrayList<String> alist3 = new ArrayList<String>(Arrays.asList(arr));
	   
	//we can add new elements also
	    alist3.add("Sunita");
	    alist3.add("Bishnupriya");
	    System.out.println(alist3);
	    
	//convert from arraylist to array
	    String arr1[] = new String[alist3.size()];
	    for (int i=0;i<alist3.size();i++)
	    {
	    	arr1[i] = alist3.get(i);
	    }
	    System.out.println("Array:");
	    for (int i=0;i<arr1.length;i++)
	    {
	    	System.out.println(arr1[i]+" ");
	    }
	    System.out.println();
	    }
}
