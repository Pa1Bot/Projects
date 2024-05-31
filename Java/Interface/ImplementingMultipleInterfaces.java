




//interface Calc1
//{
//	void add();
//	void sub();
//	
//}
//
//interface Calc2 extends Calc1
//{
//	void mul();
//	void div();
//	
//}

interface Calc1
{
	void add();
	void sub();
	
}

interface Calc2
{
	void mul();
	void div();
	
}

class Calc implements Calc1 , Calc2
{
	public void add()
	{
		int a=10;
		int b=5;
		int res=a+b;
		System.out.println(res);
		
	}
	public void sub()
	{
		int a=10;
		int b=5;
		int res=a-b;
		System.out.println(res);
		
	}
	public void mul()
	{
		int a=10;
		int b=5;
		int res=a*b;
		System.out.println(res);
		
	}
	public void div()
	{
		int a=10;
		int b=5;
		int res=a/b;
		System.out.println(res);
		
	}
	
}

public class ImplementingMultipleInterfaces {

	public static void main(String[] args) {
		

	}

}
