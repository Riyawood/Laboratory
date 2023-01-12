package collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		LinkedList<String> names =new LinkedList<String>();
		names.add("Riya");
		names.add("Priya");
		names.add("Sunita");
		names.add("Bivor");
		System.out.println(names);
		System.out.println();
		
		System.out.println("Using For Each Loop:");
	    for(String name: names)
	    {
		   System.out.println(name +" ");
	    }
	    System.out.println();
	
	    System.out.println("Using While Loop:");
	    int count=0;
	    while(count<names.size())
	    {
		    System.out.println(names.get(count));
		    count++;
	    }
	    System.out.println();
	
	    System.out.println("Using iterator:");		
	    Iterator itr = names.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println();
	    
	    System.out.println("Performing adding operations:");
	    names.addFirst("Sunita");//adding at first position
	    names.addLast("Suborno");//adding at last position
	    names.add(2,"Lokesh");//adding at index 2
	    System.out.println(names);
	    
	    System.out.println("Performing removing operations:");
	    names.removeFirst();//removing from first position
	    names.removeLast();//removing from last position
	    names.remove(2);//removing from index 2
	    System.out.println(names.remove("Lokesh"));//removing using object
	    System.out.println(names);
	    
	    System.out.println();
	    names.set(1, "Lokesh");
	    System.out.println(names);
	    System.out.println(names.get(2));
	    System.out.println(names);
	    
//	    names.removeAll(names);
//	    System.out.println(names);
	    
//	    names.clear();//it clear the linked list and makes it empty
//	    System.out.println(names);
	    
	    ListIterator listit = names.listIterator();
	    System.out.println("Forword direction");
	    while(listit.hasNext())
	    {
	    	System.out.println(listit.next());
	    }
	    System.out.println();
	    
	    System.out.println("Backword direction");
	    while(listit.hasPrevious())
	    {
	    	System.out.println(listit.previous());
	    }
	    System.out.println();
	    
	    System.out.println("Printing in reverse using descending iterator:");
	    Iterator itrl = names.descendingIterator();
	    while(itrl.hasNext())
	    {
	    	System.out.println(itrl.next());
	    }
	    System.out.println();
	    
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter a name to check:");
//	    String str= sc.next();
	    //checking the contents using if loop using contains keyword
//	    if(names.contains(str))
//	    {
//	    	System.out.println("Data is present");
//	    }
//	    else
//	    {
//	    	System.out.println("Data is not present");
//	    }
	    
	    names.add("Sabdick");
	    System.out.println(names);
	    System.out.println(names.lastIndexOf("Rahul"));
    
	    names.push("Priya");
	    System.out.println(names);
	    
	    System.out.println("Element popped: "+names.pop());
	    System.out.println(names);
	    
	    System.out.println("Element poll: "+names.poll());
	    System.out.println(names);
	    
	    System.out.println("Element poll: "+names.pollFirst());
	    System.out.println(names);
	    
	    System.out.println("Element poll: "+names.pollLast());
	    System.out.println(names);
	    
	    names.push("Sandeep");
	    names.push("Arnab");
	    //convert linked list into array list
	    List<String> arlist = new ArrayList<>(names);
	    System.out.println("converting linked list into array list");
	    System.out.println(names);
	
//	    System.out.println();
	    //convert linked list into array 
//	    String array[] = name.toArray(new.size());
//	    System.out.println("converting linked list into array");
//	    for(int i=0;i<array.length;i++)
//	    {
//	       System.out.println(array[i]+" ");
//	    }
//	    System.out.println();
	}
}
      
