
class Dog
{
	String name;
	int cost;
	
	
	void eat()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
		//i=10;
		int age=10;
		//cost=10000;
		//System.out.println(age);
		System.out.println(cost);
		
	}
	void sleep()
	{
		
		cost=12000;
		System.out.println("Sleeping");
	}
		

}

public class ObjectCreation {

	public static void main(String[] args) 
	{
		Dog dg=new Dog();
		dg.cost=1999;
		dg.eat();
		dg.sleep();
		
		Dog dg1=new Dog();
		dg1.eat();
		dg1.sleep();

	}

}
