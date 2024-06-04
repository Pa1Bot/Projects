import java.util.Scanner;

interface Calculator
{
	void add();  //public abstract void add();
	void sub();  //public abstract void sub();
}

class MyCalculator1 implements Calculator
{
	@Override
	public void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	public void sub()
	{
		int a=30;
		int b=20;
		int res=a-b;
		System.out.println(res);
	}
	
}

class MyCalculator2 implements Calculator
{
	@Override
	public void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter num1 to add");
		int a=scan.nextInt();
		System.out.println("Please enter num2 to add");
		int b=scan.nextInt();
		int res=a+b;
		System.out.println(res);
	}
	public void sub()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter num1 to sub");
		int a=scan.nextInt();
		System.out.println("Please enter num2 to sub");
		int b=scan.nextInt();
		int res=a-b;
		System.out.println(res);
	}
	
}


public class SingleInterfaceWithMultipleBehaviors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calculator c=new Calculator();
		
		Calculator myC1=new MyCalculator1();
		myC1.add();
		myC1.sub();
		
		Calculator myC2=new MyCalculator2();
		myC2.add();
		myC2.sub();

	}

}
