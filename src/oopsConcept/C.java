package oopsConcept;

public class C extends A 
{

	public void MC()
	{
		System.out.println("this is class C");
	}
	
	public void printvar()
	{
		final int i  =10;  //local variable
		//i=50;
		
		System.out.println(i); 
		System.out.println(this.i); 
		
	}
	
	
	public static void main(String[] args) {
		C c = new C();
		c.MA();
		c.MC();
	}
}
