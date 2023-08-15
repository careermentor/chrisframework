package oopsConcept;

public class D extends B implements IC
{

	public void MD()
	{
		System.out.println("this is class D");
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.MIA();
		d.MB();
		d.MD();
		d.MIC();
	}

	
	public void MIC() {
		System.out.println("this is class IC");
		
	}
}
