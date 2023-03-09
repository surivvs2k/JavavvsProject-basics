package oops;

public class Calculation {
	
	//1)Method may not take parameters -- empty parameters
	//4) Method may not return any value
	/*
	int a;
	int b;
	
	void sum() 
	{
		System.out.println("sum of a & b :" + (a+b)); // output 300
	}
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		cal.sum();
		
	} */
	
	//2)Method takes parameters
	/*	
	int a;
	int b;
	
	void sum(int x, int y) 
	{
		a=x;
		b=y;
		
		System.out.println("sum of a & b :" + (a+b));// output 300
	}
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();
		
		cal.sum(100,200);
		
	} */
	
	// 3) A method returns some value
	
	int a;
	int b;
	
	int sum() 
	{
		return(a+b);
	}
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation();
		cal.a=100;
		cal.b=200;
		int r=cal.sum();
		System.out.println(r);// output 300
		
	}

}
