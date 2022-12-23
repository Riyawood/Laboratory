package oops;
//in multilevel inheritance there is a grandparent class, parent class and child class.
//a child class can access all the information from the parent class as well as grandparent class.
class Animal
{ 						// grandparent class
	public void display()
	{
		System.out.println("This is Animal Kingdom");
	}
}
class Mammal extends Animal
{		// parent class
	public void birth()
	{
		System.out.println("Mammals gives birth tp offsprings");
	}
}
class Dog extends Mammal
{			// child class
	public void puppy()
	{
		System.out.println("Dog's offsprings are called Puppy");
	}
}
public class MultiInheritance
{
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.puppy();
		dog.birth();
		dog.display();
	}
}
