class Account
{
	// initial account balance
	int accBalance = 10000;
	
	//synchronized withdraw method
	synchronized void withdraw(int amount)
	{
		System.out.println("Start withdrawing...");
		if(this.accBalance<amount)
		{
			System.out.println("Insufficient Balance. Please deposit!");
			try 
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}
		this.accBalance=accBalance-amount;
		System.out.println("Rs. "+amount+ " has been withdrawn successfully!!");
	}
	
	//synchronized deposit method
	synchronized void deposit(int amount)
	{
		System.out.println("Start depositing...");
		this.accBalance=accBalance+amount;
		System.out.println("Rs. "+amount+" has been deposited successfully!!");
		notifyAll();
	}
	
	synchronized void display()
	{
		System.out.println("Displaying account balance..");
		try
		{
			wait(300);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Available Balance: Rs. "+this.accBalance);
	}
}

public class InterThreadCommDemo 
{
	public static void main(String[] args) 
	{
		Account acc = new Account(); //declaring object for the class

		new Thread() 
		{
			public void run()
			{
				acc.withdraw(15000); 
			}
		}.start(); //starting the thread
		
		new Thread()
		{
			public void run()
			{
				acc.deposit(20000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				acc.display();
			}
		}.start();
	}
}
