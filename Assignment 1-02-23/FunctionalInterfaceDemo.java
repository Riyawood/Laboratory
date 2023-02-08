package java8feature;

@FunctionalInterface
interface message
{
	void say();
	//void walk();
	
	default void msg()
	{
		System.out.println("Default with method body!");
	}
	
	default void talk()
	{
		System.out.println("Second default method!");
	}
	
	//can contain any number of object class method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceDemo implements message
{
	@Override
	public void say()
	{
		System.out.println("Saying I'm Back!!");
	}
	public static void main(String[] args)
	{
		FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
		demo.msg();
		demo.say();
		demo.talk();
	}
}
