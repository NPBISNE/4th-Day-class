package Package1;

public class Project3 
{
	public Project3()
	{	
		
		System.out.println("Default Constructor");
		
	}
	public Project3(int a)
	{
		
		System.out.println("One parameterised");
	}
	public Project3(int a, int b)
	{
		
		System.out.println("Two parametrised");
	}
	public Project3(int a, int b, int c)
	{
		System.out.println("Three parameterised");
	}
	public Project3(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterised");
	}
	
	public static void main(String[] args) 
	{
		
		Project3 ref4 = new Project3(12,22,23,34);
		Project3 ref = new Project3();
		Project3 ref1 = new Project3(12);
		Project3 ref2 = new Project3(12,11);
		Project3 ref3 = new Project3(12,11,18);
	}

}
