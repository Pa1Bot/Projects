class Producer extends Thread
{
	Queue q;
	
	public Producer(Queue y)
	{
		
		q=y;
		
	}
	@Override
	public void run()
	{
		int i=1;
		while(true)
		{
		 
		 q.put(i++);
		
		}
		
	}
}

class Consumer extends Thread
{
	
	Queue q;
	
	public Consumer(Queue y)
	{
		q=y;
		
	}
	@Override
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
	
}

class Queue
{
	int x;
	boolean flag=false;
	
	synchronized public void put(int data)
	{
		try
		{
			if(flag==true)
			{
				wait();
			}
			else
			{
			 x=data;
			 System.out.println("I have produced the data into x : " + x);
			 flag=true;
			 notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		
		
	}
	
	synchronized public void get()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I have consumed the data from x : "+ x);
				flag=false;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		
	}
	

}


public class ProducerConsumerProblem_InterThreadCommunication_10
{
	//Sleep can be used for intra & wait, nofity can be used for inter.
	public static void main(String[] args) 
	{
		
		Queue q=new Queue();
		
		Producer pd=new Producer(q);
		
		Consumer c=new Consumer(q);
		
		pd.start();
		c.start();
		

	}

}
