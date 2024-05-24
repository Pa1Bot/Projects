class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking off......");
	}
	public void landing()
	{
		System.out.println("Plane is landing......");
	}
	
}

class CargoPlane extends Plane
{
	@Override
	public void landing()
	{
		System.out.println("Cargo plane requires longer runway to land.....");
	}
	public void carryGoods()
	{
		System.out.println("CargoPlane carry goods....");
	}
	
}

class FighterPlane extends Plane
{
	public void landing()
	{
		System.out.println("Fighter plane requires shorter runway to land.....");
	}
	public void carryWeapons()
	{
		System.out.println("FighterPlane carry Weapons....");
	}
	
}

public class Polymorphism_Plane {

	public static void main(String[] args) {

		Plane cp=new CargoPlane();
		cp.takeOff();
		cp.landing();
		((CargoPlane) cp).carryGoods();
		
		FighterPlane fp=new FighterPlane();
		fp.takeOff();
		fp.landing();
		fp.carryWeapons();

	}

}
