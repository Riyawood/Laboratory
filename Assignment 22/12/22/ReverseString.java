package oops;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String a = "RIYA";
		
		for (int i= (a.length()-1); i>=0;i--) 
		{
			System.out.print(a.charAt(i));
		}	
	}
}
