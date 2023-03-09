package interfaces;


interface Testinter 
{
	int a=10; // by default variable is static and final
	int b=20;
	void display(); // abstract method
	
}


public class InterfaceExample implements Testinter 
	{
	public void display() 
	{
		System.out.println(a);
		System.out.println(a+b);
		System.out.println(b-a);

	}
	

	public static void main(String[] args) 
	{
		
		
		/*
		InterfaceExample ie=new InterfaceExample();
		ie.display();
		*/
		//Testinter ie=new Testinter();//invalid object creation
		Testinter ie= new InterfaceExample();
		ie.display();
		

	}

	
}
