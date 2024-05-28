import java.util.*;
class Farmer
{
	float pa;
	float td;
	
	static float ri;
	
	float si;
	
	static
	{
		ri=2.5f;
	}
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the principal amount required");
		pa=scan.nextFloat();
		System.out.println("Please enter time duration");
		td=scan.nextFloat();
		
		
	}
	
	public void compute()
	{
		si=pa*td*ri/100;
	}
	
	public void disp()
	{
		System.out.println("Si is : "+ si);
	}
	
}
public class LaunchLoanConsoleApp
{
	public static void main(String[] args) 
	{
		System.out.println("Farmer loan application: ");
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		f1.input();
		f1.compute();
		f1.disp();
		
		f2.input();
		f2.compute();
		f2.disp();
		
		f3.input();
		f3.compute();
		f3.disp();
		
		

	}

}
