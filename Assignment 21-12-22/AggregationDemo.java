package oops;
class Company
{
	int compId;
	String compName;
	Address address;

public Company(int compId, String compName, Address address) {
	super();
	this.compId = compId;
	this.compName = compName;
	this.address = address;
}
//getter method
  public int getCompId()
  {
	return compId;
  }
  public String getCompName()
  {
	return compName;
  }
  public Address getAddress()
  {
	return address;
  }
}  
public class AggregationDemo 
{
	public static void main(String[] args)
	{
		Address address1= new Address(70001, "Kolkata","West Bengal","India");
		Address address2= new Address(70002, "New York City","New York","USA");
		
		Company company1= new Company(101,"Anudip Foundation",address1);
		Company company2= new Company(102,"Anudip Foundation USA",address2);
	    
		System.out.println();
		
		System.out.println("First Company:"+company1.compName);
		System.out.println("Address:"+company1.getAddress().getCity());
	}
}
