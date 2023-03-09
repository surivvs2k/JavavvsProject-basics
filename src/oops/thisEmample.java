package oops;

public class thisEmample {
	
	
	int a;
	int b;
	String s;
	String l;
	
	void sum() // First method
	{
		a = 20;
		b = 30;
		System.out.println("sum of a+b :" +(a+b));
	}
	
	/*
	void sum(int x, int y) // Second method
	{
		a=x;
		b=y;
		System.out.println("sum of a+b :" +(a+b));
	}
	*/
	void sum(int a, int b) // Second method
	{
		this.a=a;
		this.b=b;
		System.out.println("sum of a+b :" +(a+b));
	}
	
	/*
	void sum(int x, int y, int z)  // Third method
	{
		System.out.println("sum of x+y+z :" +(x+y+z));		
	}
	
	void sum(int x, double y) // Fourth method
	{
		System.out.println("sum of x+y :" +(x+y));
	}
	*/
	
	void sum(int a, int b, int c)  // Third method
	{
		System.out.println("sum of a+b+c :" +(a+b+c));
		//System.out.println("sum of a+b+c :" +(a+b+c));		
	}
	
	void sum(int a, double b) // Fourth method
	{
		System.out.println("sum of a+b :" +(a+b));
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
		thisEmample tE = new thisEmample();
		
		tE.sum();
		tE.sum(110,220);
		tE.sum(30,40,60);
		tE.sum(25,40.5);
		tE.mytext();
		tE.mytext("Rama", "  Krishna");
		tE.mytext("Tarun ", 80, "Varun ", 90);

	}

}


/*
Output:
sum of a+b :50
sum of a+b :330
sum of a+b+c :130
sum of a+b :65.5
Raj Tej
Rama  Krishna
Tarun marks are :Tarun 80 Varun marks are :Varun 90
*/
