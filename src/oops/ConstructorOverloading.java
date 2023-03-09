package oops;

public class ConstructorOverloading {
	
	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading() 
	{
		a=10;
		b=20;
		c=20.5;
	}
	ConstructorOverloading(int x, int y)
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading(int x, double y)
	{
		a=x;
		c=y;
	}
	
	ConstructorOverloading(int x, int y, double z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	ConstructorOverloading(int x, double y, int z)
	{
		a=x;
		b=z;
		c=y;
	}
	
	void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}


	public static void main(String[] args) 
	{
		
		//First constructor
		/*
		ConstructorOverloading co=new ConstructorOverloading();
		co.display(); // Output 10 20 20.5
		*/
		
		//Second constructor
		
		/*
		ConstructorOverloading co=new ConstructorOverloading(10,20);
		co.display(); // Output 10 20 0.0
		*/

		
		//Third constructor
		/*
		ConstructorOverloading co=new ConstructorOverloading(10,20.5);
		co.display(); // Output 10 0.0 20.5
		*/
		
		//Fourth constructor
		/*
		ConstructorOverloading co=new ConstructorOverloading(11,22,33.3);
		co.display(); // Output 11,22,33.3
		*/
		
		//Fifth constructor
		ConstructorOverloading co=new ConstructorOverloading(11,33.3,22);
		co.display(); // Output 11,22,33.3 (Order of parameters like this)
		
	}

}



/*
Output:
11
22
33.3
*/
