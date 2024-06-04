
class Plane1
{
	
}
class CargoPlane1 extends Plane1
{
	
}

class Animal1
{
	public Plane1 eat(int age, String name)
	{
		System.out.println("Animal is eating..");
		Plane1 p=new Plane1();
		return p;
	}
}
class Tiger1 extends Animal1
{
	
	public CargoPlane1 eat(char a, int b)
	{
		System.out.println("Tiger hunts and eat........");
		CargoPlane1 cp=new CargoPlane1();
		return cp;
	}
	
}
public class Returntype_Change_In_OverridedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
