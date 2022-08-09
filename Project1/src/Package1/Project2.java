package Package1;

public class Project2 
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition Result is"  + c);
		return c;
	}
	public int sub(int x , int y)
	{
		int z;
		z=x-y;
		System.out.println("Substraction Result is" +z);	
		return z;
	}
	public int mul(int a1, int a2)
	{
		int a3;
		a3=a1*a2;
		System.out.println("Multiplication Result is" +a3);	
		return a3;
	}
	public void div(int x1, int x2)
	{
		int x3;
		x3=x1/x2;
		System.out.println("Division Result is" +x3);
	}
	public void nilesh(int x1, int x2)
	{
		int x3;
		x3=x1/x2;
		System.out.println("Final result is " +x3);
		
	}
	public static void main(String[] args) 
	{
		Project2 dev=new Project2();
		int sumresult=dev.sum(10, 2);
		int sumresult2=dev.sum(sumresult,2);
		int subresult=dev.sub(sumresult2, 2);
		int mulresult=dev.mul(subresult, 2);
		dev.div(mulresult, 2);
		dev.nilesh(mulresult,2);
		dev.nilesh(mulresult,2);
	}
	

}
