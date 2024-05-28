
public class StaticMembersExecutionOrder
{
	static int a;
	
	static
	{
		a=10;
		System.out.println("Static block");
		
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Main method which is also static");
		

	}

}
