package oopsConcept;

public class SimpleClass 
{

	static int i = 20;
	
	public static void method1()
	{
		System.out.println("this is simple method");
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
	
		//SimpleClass sc = new SimpleClass();
		//sc.method1();
		
		SimpleClass.method1();
		
	}
}
