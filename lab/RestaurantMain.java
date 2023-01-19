package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer, Restaurant> map = new HashMap<Integer, Restaurant>();
		
		map.put(1, new Restaurant("Chicken Biryani",130));
		map.put(2, new Restaurant("Steamed Chicken momo",80));
		map.put(3, new Restaurant("Mushroom Chilly",200));
		map.put(4, new Restaurant("Butter Paneer Masala",150));
		map.put(5, new Restaurant("Masala Dosa",100));
		map.put(6, new Restaurant("mutton Handi",250));
		
		System.out.println("Welcome to C3805 Restaurant");
		System.out.println("===========================");
		System.out.println("MENU");
		System.out.println("=====");
		System.out.println("ITEMS\t\t\tPRICE");
		
		for(Map.Entry em: map.entrySet())
		{
			Restaurant rest = (Restaurant) em.getValue();
			System.out.println(em.getKey()+")");
			rest.display();
		}
		System.out.println();
		do
		{
			System.out.println("Enter food id:");
			int id = sc.nextInt();
			Restaurant rest = map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
			
			Billing.cont();
		}while(true);

	}
}
