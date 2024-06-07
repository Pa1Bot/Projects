import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg)
	{
		super(msg);
		
	}

	
}


class ATM
{
	private int accNum=1111;
	private int passWD=2222;
	int ac;
	int pw;
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the account num");
		ac=scan.nextInt();
		System.out.println("Kindly enter the password");
		pw=scan.nextInt();
	}
	public void verify()throws InvalidCustomerException
	
	{
		if(accNum== ac && passWD == pw)
		{
			System.out.println("Collect your cash");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException("Invalid Credentials try again!");
			System.out.println(ice.getMessage());
			throw ice;
			
			
		}
	}
}

class Bank
{
	public void initiate()
	{
		ATM at=new ATM();
		try
		{
		at.input();
		at.verify();
		}
		catch(InvalidCustomerException ice)
		{
			try
			{
			at.input();
			at.verify();
			}
			catch(InvalidCustomerException ic)
			{
				try
				{
				at.input();
				at.verify();
				}
				catch(InvalidCustomerException i)
				{
					System.out.println("Card is blocked you're legend we caught you ");
				}
				
			}
			
		}
	}
}


public class ATM_Application_WithExceptionHandling
{

	public static void main(String[] args) 
	{
		
		Bank b=new Bank();
		b.initiate();
		

	}

}
