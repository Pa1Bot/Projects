class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void running()
	{
		System.out.println("Animal is running.....");
	}
	
}

class Tiger extends Animal
{
	public void eat()
	{
		System.out.println("Tiger hunts and eat..");
	}
	public void running()
	{
		System.out.println("Tiger runs faster than elepant.....");
	}
	
}
class Monkey extends Animal
{
	public void eat()
	{
		System.out.println("Monkey steals and eat");
	}
	public void running()
	{
		System.out.println("Monkey jumps.....");
	}
	
}
class Deer extends Animal
{
	public void eat()
	{
		System.out.println("Deer grazes and eat");
	}
	public void running()
	{
		System.out.println("Deer runs faster.....");
	}
	
}

class Forest
{
	public void permit(Animal ref)
	{
		ref.eat();
		ref.running();

	}

}
public class Polymorphism_Animal {

	public static void main(String[] args) 
	{
		Tiger t=new Tiger();
//		t.eat();
//		t.running();
		
//		Animal ref;
//
//		ref=t;
//
//		ref.eat();
//		ref.running();
//		
		Monkey m=new Monkey();
//		m.eat();
//		m.running();
//		ref=m;
//
//		ref.eat();
//		ref.running();
		
		Deer d=new Deer();
//		d.eat();
//		d.running();
//		ref=d;
//
//		ref.eat();
//		ref.running();
		
		Forest f=new Forest();
		f.permit(t);
		f.permit(m);
		f.permit(d);

		


	}

}
