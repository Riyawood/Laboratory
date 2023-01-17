package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapEx
{
	public static void main(String[] args) {
    HashMap<Integer,String> hmap = new HashMap<Integer,String>();
    hmap.put(101, "Amrita");
	hmap.put(107, "Rahul");
	hmap.put(113, "Shawin");
	hmap.put(109,"Lokesh");
	hmap.put(111,"Sandeep");
	hmap.put(114,"Sabdick");
	
	System.out.println(hmap);
		
	Iterator itr = hmap.entrySet().iterator();
		
	while(itr.hasNext())
	{
		Map.Entry mentry = (Entry) itr.next();
		System.out.println("Key: "+mentry.getKey());
		System.out.println("Value: "+mentry.getValue());
	}
	
	//get the values using key
	System.out.println("Value mapped with key: "+hmap.get(111));
	
	//remove the values using key
	System.out.println("Removing value using key: "+hmap.get(113));
	
	System.out.println();
	System.out.println("After removing:");
	for(Map.Entry me: hmap.entrySet())
	{
		System.out.println("Key: "+me.getKey());
		System.out.println("Value: "+me.getValue());
	}
	System.out.println();
	Map<Integer,String> tmap = new TreeMap<Integer,String>(hmap);
	
	System.out.println("After Sorting:");
	for(Map.Entry me: tmap.entrySet())
	{
		System.out.println("Key: "+me.getKey());
		System.out.println("Value: "+me.getValue());
	}
	
	//checking the size of hash map and tree map
	System.out.println("Hashmap size: "+hmap.size());
	System.out.println("TreeMap size: "+tmap.size());
	System.out.println();
	
	//checking key existence
	System.out.println("Key present: "+hmap.containsKey(114));
	System.out.println("Key present: "+hmap.containsKey(113));
	
	//checking the value existence
	System.out.println("Value present: "+hmap.containsValue("Rahul"));
	System.out.println("Value present: "+hmap.containsValue("Bishnupriya"));	
	
	System.out.println();
	System.out.println(hmap.isEmpty());//to check whether the map is empty or not
	hmap.clear();//to clear all the key-value from the map
	System.out.println(hmap.isEmpty());
	
	}
}
