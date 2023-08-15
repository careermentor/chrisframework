package oopsConcept;

public class QA4 extends QA2 //extends QA3
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of 2 numbers: " + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		q4.sum(30, 50);
		//q4.add();
		q4.sum(40, 60);
		q4.sub(50, 30);
		//q4.mul(20, 30);
		q4.div(50, 25);
		
		//QA1 q11 = new QA1();
		//q11.sum(30, 50);
		
		
	}
	
}
