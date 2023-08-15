package oopsConcept;

public class QA1 
{

	//raw file (*.java) - which can be readable - compilation .java to .class, (JVM) run/execute - output
	
	int i = 100;
	
	public void sum(int a, int b)   //method declaration
	{
		int c = a+b;											//method body
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
	}
		
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(30, 50);
		
		
		
		q1.sum(40, 60);
		
		q1.sum(350, 400);
		q1.sum(10, 20.5f);
		q1.sum(20, 30,40);
		
		
	}
	
}
