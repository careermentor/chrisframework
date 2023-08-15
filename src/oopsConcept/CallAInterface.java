package oopsConcept;

public class CallAInterface implements AInterface
{

	
	public void method3() 
	{
	
		System.out.println("this is interface method 3");
	}

	
	public static void main(String[] args) {
		CallAInterface cai = new CallAInterface();
		cai.method3();
	}


	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
	
}


//class vs class - extends
//interface vs interface - extends
//class vs interface - implements