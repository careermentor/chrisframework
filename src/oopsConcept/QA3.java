package oopsConcept;

public class QA3 extends QA2
{

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul of 2 numbers: " + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA3 q3 = new QA3();
		q3.sum(30, 50);
		q3.sum(40, 60);
		q3.mul(20, 30);
		q3.sub(50, 20);
		
		
	}
	
}
