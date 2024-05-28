class Demo4
{
	public static void disp()
	{
		System.out.println("Parent class disp()");
	}
	
}

class Demo5 extends Demo4
{
	public static void disp()
	{
		System.out.println("Child class disp()");
	}
	
	
}



public class InheritedStaticMethodsExecutionOrder {

	public static void main(String[] args) {
		Demo5 d=new Demo5();
		d.disp();
	}

}
