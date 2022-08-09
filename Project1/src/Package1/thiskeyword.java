package Package1;

public class thiskeyword 
{

	public thiskeyword ()
	{	
		this (12,22,32);
		System.out.println("Default Constructor");
		
	}
	public thiskeyword (int a)
	{

		System.out.println("One parameterised");
	}
	public thiskeyword (int a, int b)
	{
		
		System.out.println("Two parametrised");
	}
	public thiskeyword (int a, int b, int c)
	{
		
		System.out.println("Three parameterised");
	}
	public thiskeyword (int a, int b, int c, int d)
	{

		System.out.println("Four Parameterised");
	}
	
	public static void main(String[] args) 
	{
		
		thiskeyword ref3 = new thiskeyword();
		thiskeyword ref4 = new thiskeyword(12,32,44,54);
		thiskeyword ref1 = new thiskeyword(12);
		thiskeyword ref2 = new thiskeyword(12,22);
	}

}

	

