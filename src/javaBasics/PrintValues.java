package javaBasics;

public class PrintValues 
{

	//data
	
	String name = "Nahid";  //global variable
	
	public void method1()
	{
		final int Age = 40;  //local variable/bottle    // constant
		//Age = 50;
		
		System.out.println("This is my age: "  +  Age);
		System.out.println(name);
		System.out.println("we are learning java code");
		
	}
	
	public void method2()
	{
		System.out.println(name);
		//System.out.println(Age);
	}
	
	
	public static void main(String[] args) 
	{
	
		PrintValues mobile = new PrintValues();   //object of the class
		
		mobile.method1();
		mobile.method2();
		
	}
	
	
	
	
	
	
	
	
}
