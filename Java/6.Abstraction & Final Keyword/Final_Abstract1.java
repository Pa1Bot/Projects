
//final class Human1
//{
//	public void disp()
//	{
//		System.out.println("Parent class implementation");
//	}
//	
//}

 //final abstract class Human1 //
class Human1
 {
	 final float pi=3.14f;
	final public void disp()
	{
		//pi=45.5f; we cannot change
		System.out.println("Parent class implementation");
	}
	
}

class Employee1 extends Human1
{
//	public void disp()
//	{
//		System.out.println("Child class implemetatio");
//	}
//
}


public class Final_Abstract1 {

	public static void main(String[] args) 
	{
		Employee1 e=new Employee1();
		e.disp();
		

	}

}
