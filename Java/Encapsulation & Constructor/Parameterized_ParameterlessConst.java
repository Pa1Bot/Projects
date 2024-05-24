class Dog
{
	private String name;
	private int age;
	private int cost;
	
	Dog(String name, int age, int cost)
	{
		this.name=name;
		this.age=age;
		this.cost=cost;
		
	}
	Dog()
	{
		System.out.println("Zero parametrized Constructor");
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

public class Parameterized_ParameterlessConst
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Dog d1=new Dog("Sheeru", 2,12000);
		System.out.println(d1.getName());
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		
		Dog d2=new Dog();
		
		
		
	}

}
