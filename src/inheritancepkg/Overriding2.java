package inheritancepkg;


class Vehicle 
{
	void run() 
	{
		System.out.println("Vehicle is running");
	}
	
}

final class Bike extends Vehicle
{
	void run() 
	{
		System.out.println("Bike is running");
	}
}


public class Overriding2 {

	public static void main(String[] args) 
	{
		Vehicle vobj=new Vehicle();
		vobj.run();
		
		Bike bobj=new Bike();
		bobj.run();

	}

}


/*
Output:
Vehicle is running
Bike is running
*/
