package javaBasics;

public class SimpleClass 
{
	
	public void sum()    //this method do not take input/parameter/argument
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("sum of 2 numbers: " + c);
		
	}
	
	
	public int addition(int a, int b)  //this method take inputs/parameters/arguments
	{
		int c = a+b;
		
		System.out.println("addition of 2 numbers: " + c);
		return c;
		
	}
	
	//20+30+50 = 100
	
	//20+30 = x
	//x+50 = 100
	
	public SimpleClass()  //do not take input
	{
		System.out.println("this is called constructor");
	}
	
	public SimpleClass(int a, int b)  ///take input
	{
		int c = a-b;
		System.out.println("this is substarction between 2 numbers: " + c );
		
	}

	public static void main(String[] args) 
	{
		SimpleClass sc = new SimpleClass(30,20);  //constructor will be automatically called when you create object of the class.
		
		sc.sum();
		sc.addition(50, 100);
		sc.addition(200, 300);
		sc.addition(10, 20);
		
		int x = sc.addition(20, 30);
		sc.addition(x, 50);
		
		//in method - it will take input/argument/parameter and also return output

		// constructor also can take input like method but never return output
	}

}
