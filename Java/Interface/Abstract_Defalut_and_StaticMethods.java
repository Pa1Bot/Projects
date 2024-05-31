
interface Draw
{
	void drawing();
	
	default void disp()
	{
		System.out.println("Body of a method in an interface");
	}
	public static void staticMethod()
	{
		System.out.println("Static method in an interface");
	}
	
}

class Drawing implements Draw
{
	public void drawing()
	{
		System.out.println("Drawing");
	}
//	public void disp() overriding is optional 
//	{
//		System.out.println("Disp in implementing class");
//	}
	
//	@Override
//	public static void staticMehtod()
//	{
//		System.out.println("static in implementing class");
//	}
	
}


public class Abstract_Defalut_and_StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawing d=new Drawing();
		d.drawing();
		d.disp();
		
		Draw.staticMethod();

	}

}

