package oops;

public class StaticExample {
	
	
	int a; // not static
	static int b;  // static
	
	static void m1() 
	{
		System.out.println("this is m1 -- static method");
	}
	
	void m2() 
	{
		System.out.println("this is m2 -- non static method");

	}
	
	
	void m3() 
	{
	
		a=333; // non static variable
		b=999; // static variable
		
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) {
		
		b=100;
		System.out.println(b);
		m1();
		
		
		//a=200; not accessible it is non static variable
		//m2() : not accessible it is non static method
		
		// can access non static variable and non static method using object
		
		StaticExample se=new StaticExample(); 
		se.a=200;
		System.out.println(se.a);
		se.m2();
		System.out.println("********this is m3 non static method*****");
		se.m3();
		
		
	}

}
