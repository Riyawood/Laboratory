package exceptionhandling;

public class TaxNotEligibleException extends RuntimeException
{
	public TaxNotEligibleException (String message)
	{
		super (message);
	}
}
