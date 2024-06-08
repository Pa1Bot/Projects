import java.util.Scanner;

class UnderAgeException extends Exception
{
	public UnderAgeException(String msg)
	{
		super(msg);
		
	}
	
}
class OverAgeException extends Exception
{
	public OverAgeException(String msg)
	{
		super(msg);
		
	}
	
}


class Applicant
{
	int age;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
	}
	
	public void verify()throws UnderAgeException, OverAgeException
	{
		if(age<18 )
		{
			UnderAgeException uae=new UnderAgeException("You're too young! Please have patience");
			System.out.println(uae.getMessage());
			throw uae;
			
		}
		else if(age >60)
		{
			OverAgeException oae=new OverAgeException("Your time is near! Be carefull ");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("You're eligible for driving license");
		}
	}
	
}

class RTO
{
	public void initiate()
	{
		Applicant a=new Applicant();
		try
		{
		a.input();
		a.verify();
		}
		catch(OverAgeException oae)
		{
			try
			{
				a.input();
				a.verify();
			}
			catch(Exception e)
			{
				System.out.println("You cannot apply! BLOCKED");
			}
			
		}
		
		catch(UnderAgeException uae)
		{
			try
			{
				a.input();
				a.verify();
			}
			catch(Exception e)
			{
				System.out.println("You cannot apply! BLOCKED");
			}
			
		}
	}
	
}


public class DrivingLicense_Application_WithExceptionHandling_7{

	public static void main(String[] args) {
		
		RTO rt=new RTO();
		rt.initiate();
	}

}
