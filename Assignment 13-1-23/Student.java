package collections;

public class Student
{
    int id;
    String name;
    int roll;
   
    public String getName() 
    {
	    return name;
    }

    public int getId() 
    {
        return id;
    }

    public int getRoll() 
    {
	    return roll;
    }

    public Student()
    {
	    super();
    }

    public Student(int id, String name, int roll) 
    {
        super();
	    this.id = id;
	    this.name = name;
	    this.roll = roll;
    }
}
