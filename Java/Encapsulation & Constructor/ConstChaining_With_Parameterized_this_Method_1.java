class Dog3
{
	private String name;
	private int age;
	private int cost;
	public Dog3()
	{
		this("Sheeru", 4, 34444);
		
	}
	public Dog3(String name, int age, int cost)
	{
		this("Lobo");
		this.name=name;
		this.age=age;
		this.cost=cost;	
	}
	public Dog3(String name)
	{
		
		this.name=name;	
		age=44;
		cost=54444;
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



public class ConstChaining_With_Parameterized_this_Method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog3 d2=new Dog3();
		System.out.println(d2.getName());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());

	}

}
