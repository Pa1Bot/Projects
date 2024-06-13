import java.util.Scanner;

class MultipleTask implements Runnable
{
	public void run()
	{
		
		String tname=Thread.currentThread().getName();
		if(tname.equals("BANK"))
		{
			banking();
		}
		else if(tname.equals("PRINTN"))
		{
			printingNum();
		}
		else
		{
			printingAlpha();
		}
		
	}
	public void banking()
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
	
	public void printingNum()
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
	
	public void printingAlpha()
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



public class InDependentThreads_Using_ThreadClass_With_SingleRunMethod_4 {

	public static void main(String[] args) 
	{
		MultipleTask mt=new MultipleTask();
		
		Thread t1=new Thread(mt);
		
		Thread t2=new Thread(mt);
		
		Thread t3=new Thread(mt);
		
		t1.setName("BANK");
		t2.setName("PRINTN");
		t3.setName("PRINTA");
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		



	}

}
