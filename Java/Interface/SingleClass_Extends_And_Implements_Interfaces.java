interface Demo1
{
	//Marker interface //Tagged interface
}

interface Cal
{
	float pi=3.14f; //public final static float pi=3.14f;
	void add();
	
}

class Calc12
{

	void disp()
	{
		System.out.println("Disp of calc");
	}
}

class MyCal extends Calc12 implements Cal
{
	public void add()
	{
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);
	}
	
}



public class SingleClass_Extends_And_Implements_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
