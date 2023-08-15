package oopsConcept;

public class QA2 extends QA1
{
	
	int i = 200;
	public void printvar()
	{
		
		int  i =300;
		System.out.println(i);  //300
		System.out.println(this.i);  //200
		System.out.println(super.i);  //100
		
		super.sum(30, 50);  //30+50
	}
	
	public void sum(int a, int b)   //method declaration
	{
		int c = a*a+b*b;											//method body
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub between 2 numbers: " + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		
		q2.printvar();
		
		q2.sum(30, 50);  //a*a+b*b = 3400
		
		q2.sum(40, 60);
		
		q2.sub(50, 30);
		
		
	}
	
}
