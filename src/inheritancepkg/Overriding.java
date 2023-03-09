package inheritancepkg;

class Bank 
{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI 
{
	int getRateOfInterest() {
		return 10;
	}
}

class ICICI 
{
	int getRateOfInterest() {
		return 15;
	}
}

class AXIS 
{
	int getRateOfInterest() {
		return 20;
	}
}

public class Overriding {

	public static void main(String[] args) 
	{
		SBI sbiobj=new SBI();
		System.out.println(sbiobj.getRateOfInterest());
		
		ICICI iciciobj=new ICICI();
		System.out.println(iciciobj.getRateOfInterest());
		
		AXIS axisobj=new AXIS();
		System.out.println(axisobj.getRateOfInterest());



	}

}
