package oopsConcept;

public class CallAClass extends AClass
{

	
	public void method2() 
	{	
		System.out.println("this is my credential");
	}

	
	public static void main(String[] args)
	{
	
		CallAClass cac = new CallAClass();
		cac.method1();
		cac.method2();
		
	}
	
}
