
class Bathroom implements Runnable
{
	//It is like applying lock to this method if 1thread gets a chance then other Threads cannot execute it. It
	//looks like a single threaded programming but it is not completely single threaded programming , it is just
	// that we are controlling the threads.
	//Here we are achieveing a scenario where in, If a single resource has to be used by multiple threads, we are doing
	//it by applying lock to the method /resource using synchronized keyword.
	synchronized public void run()
	{
		try
		{
			
		
		System.out.println(Thread.currentThread().getName() + " has entered the bathroom");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName() + " is using the bathroom");
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName() + " has exited the bathroom");
		
		
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted");
		}
	}
	
	
}

public class SynchronizedMethod_5
{

	public static void main(String[] args) 
	{
		Bathroom b=new Bathroom();
		
		Thread t1=new Thread(b);
		Thread t2=new Thread(b);
		Thread t3=new Thread(b);
		
		t1.setName("BOY");
		t2.setName("GIRL");
		t3.setName("TIKTOKER");
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
