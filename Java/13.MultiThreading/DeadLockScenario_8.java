class Library implements Runnable
{
	String res1=new String("JAVA");
	String res2=new String("DSA");
	String res3=new String("SpringBoot");

	@Override
	public void run() 
	{
		String tname=Thread.currentThread().getName();
		if("Student1".equals(tname))
		{
			try
			{
				Thread.sleep(4000);
				synchronized(res1)
				{
					System.out.println("Student1 has acquired : "+ res1);
					Thread.sleep(4000);
					synchronized(res2)
					{
						System.out.println("Student1 has acquired : "+ res2);
						Thread.sleep(4000);
						synchronized(res3)
						{
							System.out.println("Student1 has acquired : "+ res3);
						}
						
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
		}
		else
		{
			try
			{
				Thread.sleep(4000);
				synchronized(res1)
				{
					
					System.out.println("Student2 has acquired : "+ res1);
					Thread.sleep(4000);
					synchronized(res2)
					{
						System.out.println("Student2 has acquired : "+ res2);
						Thread.sleep(4000);
						synchronized(res3)
						{
							System.out.println("Student2 has acquired : "+ res3);
						}
						
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("Some problem");
			}
			
		}
		
	}
}



public class DeadLockScenario_8
{

	public static void main(String[] args) 
	{
		Library lib=new Library();
		
		Thread t1=new Thread(lib);
		
		Thread t2=new Thread(lib);
		
		t1.setName("Student1");
		t2.setName("Student2");
		
		t1.start();
		t2.start();
		

	}

}
