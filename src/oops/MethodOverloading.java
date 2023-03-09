package oops;

public class MethodOverloading {

	
	
	int a;
	int b;
	String s;
	String l;
	
	void sum() // First method
	{
		a = 10;
		b = 20;
		System.out.println("sum of a+b :" +(a+b));
	}
	
	void sum(int x, int y) // Second method
	{
		a=x;
		b=y;
		System.out.println("sum of a+b :" +(a+b));
	}
	
	void sum(int x, int y, int z)  // Third method
	{
		System.out.println("sum of x+y+z :" +(x+y+z));		
	}
	
	void sum(int x, double y) // Fourth method
	{
		System.out.println("sum of x+y :" +(x+y));
	}
	
	void mytext() 
	{
		s = "Raj";
		l = " Tej";
		System.out.println(s+l);
	}
	
	void mytext(String s, String m) 
	{
		System.out.println(s+m);
	}
	
	void mytext(String s, int x, String m, int y) 
	{
		System.out.println("Tarun marks are :" +(s+x+" Varun marks are :" +(m+y)));
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		
		mo.sum();
		mo.sum(100,200);
		mo.sum(20,30,50);
		mo.sum(20,35.5);
		mo.mytext();
		mo.mytext("Rama", "  Krishna");
		mo.mytext("Tarun ", 80, "Varun ", 90);

	}

}
