package javaBasics;

public class FirstProgram 
{

	int i = 10;
	float j = 20.5f;
	char k = 'A';
	String name = "Java";
	
	public void printvar()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
	   System.out.println("this is main method");	
	   
	   FirstProgram abc = new FirstProgram();   //to create object of the class
	   abc.printvar();
	}
}