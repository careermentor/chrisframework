package oopsConcept;

public abstract class AClass    //abstract class
{
	
	int i  =20;
	

	public void method1()  //concrete method
	{
		int j = 30;
		j=40;
		
		System.out.println("this is a concrete method");
	}
	
	
	public abstract void method2();  //abstract method
	
	

	public static void main(String[] args)
	{
	
		//AClass ac = new AClass();
		//ac.method1();
		//ac.method2();
		
		
	}
	
}
