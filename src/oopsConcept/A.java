package oopsConcept;

public class A {

	int i = 30;  //global variable
	
	public void MA()
	{
		
		final int i = 20;   //local variable
	//	i=50;
		
		System.out.println(i);  //20
		System.out.println(this.i); //30
		
		System.out.println("this is class A");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.MA();
	}
}
