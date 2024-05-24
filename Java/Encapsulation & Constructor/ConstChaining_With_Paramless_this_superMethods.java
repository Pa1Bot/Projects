

class Dog1
{
	private String name;
	private int age;
	private int cost;
	
	
	public Dog1()
	{
		super();
		System.out.println("Zero parametrized Cons");
		
	}
	public Dog1(String name, int age, int cost)
	{
		this();

		this.name=name;
		this.age=age;
		this.cost=cost;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getCost() {
		return cost;
	}
	
}


public class ConstChaining_With_Paramless_this_superMethods {

	public static void main(String[] args) 
	{
		Dog1 d1=new Dog1();
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		
		
		Dog1 d2=new Dog1("Sheeru", 2, 12000);
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		
		//d1.disp();



	}

}
