package com.junit;

public class Calculator
{
	public int addition(int a, int b)
	{
		return a+b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int substract(int a, int b)
	{
		return a-b;
	}

	public int division(int a, int b)
	{
		return a/b;
	}

	public int factorial(int n) //5*4*3*2*1
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f *= i; //f=f*i;
		}
		return f;
	}
}
