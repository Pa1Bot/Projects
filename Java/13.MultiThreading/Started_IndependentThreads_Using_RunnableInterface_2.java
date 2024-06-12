import java.util.Scanner;

class Banking implements Runnable
{
	
	
	public void run()
	{
		System.out.println("Activity 1 started");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter you account num");
		int ac=scan.nextInt();
		System.out.println("Enter you account password");
		int pw=scan.nextInt();
		
		System.out.println("please see the account details");
		
		System.out.println("Activity 1 ended");
		
		System.out.println("**************************************************");
	}
	
}

class PrintingNum implements Runnable
{
	public void run()
	{
		System.out.println("Activity 2 started");
		for(int i=0;i<5;i++)
		{
		System.out.println(i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println("Activity 2 ended");
		
		System.out.println("**************************************************");

		
	}
}

class PrintingAlpha implements Runnable
{
	public void run()
	{
		System.out.println("Activity 3 started");
		
		for(int i=65;i<70;i++)
		{
		System.out.println((char)i);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		System.out.println("Activity 3 ended");
	}
}

public class Started_IndependentThreads_Using_RunnableInterface_2
{

	public static void main(String[] args)throws Exception 
	{
		
		
		Banking b=new Banking();
		
		
		PrintingNum pn=new PrintingNum();
		
		
		PrintingAlpha pa=new PrintingAlpha();
		
		Thread t1=new Thread(b);
		
		Thread t2=new Thread(pn);
		
		Thread t3=new Thread(pa);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
