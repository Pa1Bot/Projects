
class Example implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<3;i++)
		{
			try
			{
				System.out.println("Focus is the key");
				//Thread can be interrupted only if it is in the state other than Running state. So we made the Thread
				//to sleep and then we've interrupted it using interrupt method.
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Thread is interrupted");
			}
			
		}
		
		
	}
	
}


public class StatesOfThread_InterruptedState_7 {
//New, Runnable/ready, Running, Dead, Sleep, Blocked, Waiting
	public static void main(String[] args) 
	{
		Example ex=new Example();
		
		Thread t1=new Thread(ex);
		
		t1.start();
		t1.interrupt();
	

	}

}
