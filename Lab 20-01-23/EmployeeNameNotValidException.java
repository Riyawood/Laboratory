package exceptionhandling;

public class EmployeeNameNotValidException extends RuntimeException
{
	public EmployeeNameNotValidException(String message)
	{
		super(message);
	}

}
