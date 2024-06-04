
interface Demo
{
	int disp(); //public abstract int disp();
	void add(int a, int b);  //public abstract void add(int a, int b);
}

class Demo2 implements Demo
{
	public int disp()
	{
		System.out.println("Disp is implemented");
		return 10;
	}
	public void add(int a, int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	
}


public class Interface1
{

	public static void main(String[] args)
	{
		Demo d=new Demo2();
		d.disp();
		d.add(10, 20);
		
		

	}

}
