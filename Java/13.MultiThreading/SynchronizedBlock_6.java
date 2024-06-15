class Car implements Runnable
{
	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName() + " has entered the parking lot");
			Thread.sleep(3000);
			//If once thread has got the chance to execute then other threads are not getting executed
			// until that thread completed the execution.
			synchronized(this)
			{
				System.out.println(Thread.currentThread().getName() + " has entered into to the car");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " has started to drive the car");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName() + " came back and parked the car");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
	}
	
}


public class SynchronizedBlock_6
{

	public static void main(String[] args) 
	{
		Car c=new Car();
		
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		
		t1.setName("Child1");
		t2.setName("Child2");
		t3.setName("Child3");
		
		t1.start();
		
		t2.start();
		t3.start();
		
		
		

	}

}
