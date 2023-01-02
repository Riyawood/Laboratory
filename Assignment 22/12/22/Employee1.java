package oops;
public class Employee1 
{
	int id;
	 String name,address;
	 long phone;
	 double basicSalary;
	final double specialAllowance=250.80 ;
	final double Hra=1000.50 ;
	 
public Employee1(int id, String name, String address, long phone, double basicSalary) 
{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.basicSalary = basicSalary;
	}

public double calculateSalary() {
	double salary=(basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100));
	return salary;
}

public void calculatetransportAllowance() {
	double transportAllowance= ((10*basicSalary)/100);
	System.out.println("Transport Allowance:"+transportAllowance);
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", basicSalary="
			+ basicSalary + ", specialAllowance=" + specialAllowance + ", Hra=" + Hra + "]";
}

public void display() {
	System.out.println("Id:" +id);
	System.out.println("Name:" +name);
	System.out.println("Address:" +address);
	System.out.println("Phone:" +phone);
	System.out.println("Salary:" +basicSalary);
	System.out.println("SpecialAllowance :" +specialAllowance);
	System.out.println("Hra:"+Hra);
	}
}
class Manager extends Employee1
{
	public Manager(int id, String name, String address, long phone, double basicSalary) {
		super(id, address, address, phone, basicSalary);
		this.basicSalary=basicSalary;
	}
	
	public double calculateSalary() {
		double salary=(basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100));
		return salary;
	}
	
	public void calculatetransportAllowance() {
		double transportAllowance= ((15*basicSalary)/100);
		System.out.println("Transport Allowance:"+transportAllowance);
	}
}

class Trainee extends Employee1{
	public Trainee(int id, String name, String address, long phone, double basicSalary) {
		super(id, address, address, phone, basicSalary);
		this.basicSalary=basicSalary;
}
}
