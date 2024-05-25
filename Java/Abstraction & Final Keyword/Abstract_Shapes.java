import java.util.*;

abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void disp()
	{
		System.out.println("The area is : "+ area);		
	}	
}
class Rectangle extends Shapes
{
	float len;
	float brt;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the length of Rectangle");
		len=scan.nextFloat();
		System.out.println("Kindly enther the breadth of Rectangle");
		brt=scan.nextFloat();
		
	}
	
	public void compute()
	{
		area=len*brt;
		
	}
	
}

class Square extends Shapes
{
	float len;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the length of Square");
		len=scan.nextFloat();
		
	}
	
	public void compute()
	{
		area=len*len;
		
	}
	
}

class Circle extends Shapes
{
	float rad;
	final float pi=3.14f;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter the radius of circle");
		rad=scan.nextFloat();
		
	}
	
	public void compute()
	{
		area= pi*rad*rad;
		
	}
	
}

class Geometry
{
	public void permit(Shapes ref)
	{
		ref.input();
		ref.compute();
		ref.disp();
		
	}
	
}
public class Abstract_Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle();
		Square sq=new Square();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		g.permit(rec);
		g.permit(sq);
		g.permit(c);
		
	}

}
