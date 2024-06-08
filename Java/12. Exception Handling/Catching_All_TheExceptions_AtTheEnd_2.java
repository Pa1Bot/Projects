import java.util.Scanner;

public class Catching_All_TheExceptions_AtTheEnd_2
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
		
		System.out.println("Enter the size of an array");
		int size =scan.nextInt();
		
		int []ar=new int[size];
		
		System.out.println("Please enter elem to be insert in array");
		int elem=scan.nextInt();
		 System.out.println("Enter position/index at which the element has to be inserted");
		 int pos=scan.nextInt();
		 ar[pos]=elem;
		 //ar[1]=10;
		 System.out.println("Array data stored is: "+ar[pos]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please enter non zero denominator");
			
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
