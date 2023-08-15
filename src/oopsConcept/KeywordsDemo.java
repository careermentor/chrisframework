package oopsConcept;

public class KeywordsDemo 
{

	static int i = 20;  //global variable
	
	public void printvar()
	{
		final int i  =10;  //local variable
		//i=50;
		
		System.out.println(i); 
		System.out.println(this.i); 
		
	}
	
	public static void meth1()
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		
		KeywordsDemo kd = new KeywordsDemo();
		kd.printvar();
		
		KeywordsDemo.meth1();
		
		
	}
}
