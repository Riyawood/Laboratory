package exceptionhandling;

public class CountryNotValidException extends RuntimeException
{
	public CountryNotValidException(String message) 
	{
		super(message);
	} 
}
