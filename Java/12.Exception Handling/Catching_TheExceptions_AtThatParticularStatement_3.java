import java.util.Scanner;

public class Catching_TheExceptions_AtThatParticularStatement_3
{

	public static void main(String[] args) 
	{
		System.out.println("Connection is Established to An App");
		Scanner scan =new Scanner(System.in);
		try
		{
		
		System.out.println("Kindly enter the numerator to divide ");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The result is : "+ res);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
			System.out.println("please enter non zero denominator");
			
		}
		
		try
		{
		System.out.println("Enter the size of an array");
		int size =scan.nextInt();
		
		int []ar=new int[size];
		
		System.out.println("Please enter elem to be insert in array");
		int elem=scan.nextInt();
		 System.out.println("Enter position/index at whoch the element has to be inserted");
		 int pos=scan.nextInt();
		 ar[pos]=elem;
		 //ar[1]=10;
		 System.out.println("Array data stored is: "+ar[pos]);
		}
		
		catch(NegativeArraySizeException e)
		{
			System.out.println("please be positive");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please be in your limits");
			
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
		
		
		System.out.println("Connectiom is terminated from an App");


	}

}
