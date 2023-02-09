public class PriorityThread extends Thread
{
	 public void run()  
	 {  
		System.out.println("Inside the run() method");  
	 }  
     public static void main(String argvs[])  
	 {   
    	 Thread.currentThread().setPriority(7);  
         System.out.println("Priority of the First thread is : " + Thread.currentThread().getPriority());  
	  
	     PriorityThread Thread = new PriorityThread();  
	     System.out.println("Priority of the Second thread is : " + Thread.getPriority());  
	 }  
}
