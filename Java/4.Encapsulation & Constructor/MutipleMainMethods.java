
class Student 
{
	
	private String name;
	private int age;
	private int marks;
	
	
	
	public Student(String name, int age, int marks) 
	{
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMarks() {
		return marks;
	}
	
}

public class MutipleMainMethods {

	static public void main(String[] hyder) 
	{
		System.out.println("Main method 1 String [] args");
		main(10);
	}
	public static void main(int[] args) 
	{
		System.out.println("Main method2");
	}
	public static void main(int a) 
	{
		System.out.println("Main method3");
	}
	public static void main(int a, int b) 
	{
		System.out.println("Main method4");
	}

}
