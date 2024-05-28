class Demo1
{
	static int a,b;
	
	int x,y;
	
	static
	{
		a=10;
		b=20;
		System.out.println("Static block");
	}
	
	{
		x=10;
		y=20;
		System.out.println("Non Static block/Java Block");
	}
	
	public Demo1()
	{
//		{
//			x=10;
//			y=20;
//			System.out.println("Non Static block/Java Block");
//		}
		System.out.println("Constructor");
	}
	
	public static void disp()
	{
		System.out.println("Value of a : " + a);
		System.out.println("Value of b : " + b);
	}
	
	public void disp2()
	{
		System.out.println("Value of x : " + x);
		System.out.println("Value of y : " + y);
	}
}

public class Static_NonStaticMembersExecutionOrder {

	public static void main(String[] args) 
	{
		Demo1.disp();
		
		//Demo1.disp2();
		
		Demo1 d=new Demo1();
		d.disp2();
		//d.disp();
		

	}

}
