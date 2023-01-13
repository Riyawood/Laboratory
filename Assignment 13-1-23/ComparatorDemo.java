package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorDemo
{
	public static void main(String[] args) 
	{
     ArrayList<Student> alist = new ArrayList<Student>();
     
     alist.add(new Student(101, "Rahul", 3));
     alist.add(new Student(103, "Amrita", 1));
     alist.add(new Student(102, "Lokesh",2));
     
     System.out.println("Sorting by names:");
     Collections.sort(alist, new NameComparator());
     
     Iterator itr = alist.iterator();
     while(itr.hasNext())
     {
    	 Student s = (Student) itr.next();
    	 System.out.println(s.id+" "+s.name+" "+s.roll);
     }
     System.out.println();
		
	 System.out.println("Sorting by ID:");
	 Collections.sort(alist, new IDComparator());
		
	 Iterator itr1 = alist.iterator();
	 while(itr1.hasNext())
	 {
		  Student s = (Student) itr1.next();
		  System.out.println(s.id+" "+s.name+" "+s.roll);
	 }
	 System.out.println();

	 System.out.println("Sorting by Roll:");
     Collections.sort(alist, new RollComparator());
     
     Iterator itr2 = alist.iterator();
     while(itr2.hasNext())
     {
    	 Student s = (Student) itr2.next();
    	 System.out.println(s.id+" "+s.name+" "+s.roll);
     }
     System.out.println();
 
	}
}
