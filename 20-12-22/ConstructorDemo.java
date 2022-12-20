package oops;
class Student1
{
	int id;
	String name,address;
	long phone;
	static String institute="Anudip Foundation";//static variable
	
	//parameterized Constructor
	public Student1(int id, String name,String address, long phone)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Mobile No.: "+phone);
		System.out.println("Institute: "+institute);
	}
	public static void changeInstituteName()
	{
		institute= "Anudip Foundation for Social Welfare";
	}
}
public class ConstructorDemo
{
	public static void main(String[] args)
	{
		Student1 student1 = new Student1(101,"Riya", "Ranchi", 9709111760l);
		student1.display();
		System.out.println();
		Student1.changeInstituteName();
		Student1 student2 = new Student1(102,"Priya", "Barasat", 9442313466l);
		student2.display();
	}
}
