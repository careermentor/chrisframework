package oopsConcept;

public class B implements IA
{

	public void MB()
	{
		System.out.println("this is class B");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.MIA();
		b.MB();
	}

	
	public void MIA() {
		System.out.println("this is interface IA");
		
	}
	
	
	
}
