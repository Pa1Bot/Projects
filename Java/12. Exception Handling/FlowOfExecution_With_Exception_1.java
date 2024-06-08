import java.util.Scanner;

public class FlowOfExecution_With_Exception_1
{

	public static void main(String[] args) 
	{
		System.out.println("Connection is Established to An App");
		try
		{
		Scanner scan =new Scanner(System.in);
		System.out.println("Kindly enter the numerator to divide ");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The result is : "+ res);
		}
		catch(Exception e)
		{
			System.out.println("Please enter integer data on non zero");
			
		}
		
		
		
		System.out.println("Connectiom is terminated from an App");
		

	}

}
