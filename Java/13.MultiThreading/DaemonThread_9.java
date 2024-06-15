class WordPad extends Thread
{
	public void run()
	{
		String tName=Thread.currentThread().getName();
		if("Type".equals(tName))
		{
			typing();
		}
		else if("Spell".equals(tName))
		{
			spellCheck();
		}
		else
		{
			autoSave();
		}
		
	}
	
	public void typing()
	{
		try
		{
			for(int i=0;i<3; i++)
			{
				System.out.println("Typing...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		
		
	}
	public void spellCheck()
	{
		try
		{
			//This is an infinite loop. Which will not execute for infinite times because the setting hasbeen
			//done in the backend in a way that the purpose of this type of infinite loop is not to execute for infinite times
			//rather for the deamon thread purpose.
			for(; ; )
			{
				System.out.println("spelling check...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		
		
	}
	public void autoSave()
	{
		try
		{
			for(; ; )
			{
				System.out.println("saving...");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Some problem");
		}
		
		
	}
	
}


public class DaemonThread_9
{
	//It is like after executing all the threads, these things under deamon thread should get executed atleast once at the end.
	public static void main(String[] args) 
	{
		WordPad wd1=new WordPad();
		WordPad wd2=new WordPad();
		WordPad wd3=new WordPad();
		
		wd1.setName("Type");
		wd2.setName("Spell");
		wd3.setName("Save");

		//We have to do 2things- Whichever Thread we want it to act like a deamon thread we have to make them true
		//by using setDeamon
		//Whichever activity we want the deamon thread to do, we have to mention that in the infinite loop.
		wd2.setDaemon(true);
		wd3.setDaemon(true);

		//We have to make the priority of deamon threads set to lessthan5
		wd2.setPriority(3);
		wd3.setPriority(2);
		
		wd1.start();
		wd2.start();
		wd3.start();
	}

}
