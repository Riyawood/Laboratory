package oops;
public class InheritanceActivity
{
	public static void main(String[] args)
	{
			Manager manager = new Manager(126534, "Amit", "Delhi India", 237844, 65000);
			manager.display();
			System.out.println("| Employee1 Salary: "+ manager.calculateSalary());
			manager.calculatetransportAllowance();
			
			Trainee trainee = new Trainee(29846, "Jyoti", "Banglore India", 442085, 45000);
			trainee.display();
			System.out.println("| Employee1 Salary: "+trainee.calculateSalary());
			trainee.calculatetransportAllowance();
		}
}
