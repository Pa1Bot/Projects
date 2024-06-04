class Dog2
{
	private String name;
	private int age;
	private int cost;
	public Dog2()
	{
		this("Lobo");
		
	}
	public Dog2(String name, int age, int cost)
	{	
		this.name=name;
		this.age=age;
		this.cost=cost;	
	}
	public Dog2(String name)
	{
		this("Sheeru", 4, 14444);
		this.name=name;	
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
public class ConstChaining_With_Parameterized_this_Method {

	public static void main(String[] args) 
	{
		//Dog2 d2=new Dog2("Sheeru", 4, 14444);
		Dog2 d2=new Dog2();
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		
		

	}

}
