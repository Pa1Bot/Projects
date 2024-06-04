
class Employee
{
	String name;
	int age;
	int salary;
	
	public Employee()
	{
		name="Sheeru";
		age=18;
		salary=15000;
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(salary);
	}
	
	@Override
	public String toString()
	{
		return name + " " + age + " "+ salary;
		
	}
	
	
	
}

public class toStringMethod {

	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e);
		
		
	
		

	}

}
