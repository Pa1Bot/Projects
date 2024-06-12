
public class MethodsOfThread_1
{

	public static void main(String[] args) 
	{
		Thread thread=Thread.currentThread();
		
		String tName=thread.getName();
		System.out.println("Name of Thread is : " + tName);
		
		int p=thread.getPriority();
		System.out.println("Default Proirity of Main Thread is : " + p);
		
		thread.setName("Telusko");
		thread.setPriority(4);
		
		String tName1=thread.getName();
		System.out.println("Name of Thread after changing is : " + tName1);
		
		int p1=thread.getPriority();
		System.out.println("Default Proirity of Main Thread after changing is : " + p1);
		
		
		

	}

}
