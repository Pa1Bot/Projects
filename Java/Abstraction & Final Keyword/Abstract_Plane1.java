
abstract class Plane2
{
	
	public Plane2()
	{
		System.out.println("Plane 2 constructor");
	}
	//abstract int a;// illegal
	abstract public void takeOff();
	
	abstract public void landing();
	
	public void disp()
	{
		System.out.println("Parent class implmentation");
	}	
}

class CargoPlane2 extends Plane2
{
	@Override
	public void takeOff()
	{
		System.out.println("CargoPlane is requires longer runway to take off......");
	}
	@Override
	public void landing()
	{
		System.out.println("Cargo plane requires longer runway to land.....");
	}
	
	
}

class FighterPlane2 extends Plane2
{
	public void takeOff()
	{
		System.out.println("FighterPlane is requires shorter runway to take off......");
	}
	public void landing()
	{
		System.out.println("Fighter plane requires shorter runway to land.....");
	}
	
	
}
class PassengerPlane2 extends Plane2
{
	public void takeOff()
	{
		System.out.println("PassengerPlane is requires medium runway to take off......");
	}
	public void landing()
	{
		System.out.println("Passenger plane requires medium size runway to land.....");
	}
	
	
}

class Airport
{
	public void permit(Plane2 ref)
	{
		ref.takeOff();
		ref.landing();
		ref.disp();
		
	}
}

public class Abstract_Plane1
{

	public static void main(String[] args) 
	{
		//Plane2 r =new Plane2();

		CargoPlane2 cp=new CargoPlane2();
		
		FighterPlane2 fp=new FighterPlane2();
		
		PassengerPlane2 pp=new PassengerPlane2();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);


	}

}
