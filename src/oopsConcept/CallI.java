package oopsConcept;

public class CallI implements I
{

	public void m3() {

		System.out.println("this is interface method3");
	}

	
	public void m4() {
		System.out.println("this is interface method4");
		
	}
	
	
	public static void main(String[] args) {
		CallI i = new CallI();
		i.m3();
		i.m4();
	}

}
