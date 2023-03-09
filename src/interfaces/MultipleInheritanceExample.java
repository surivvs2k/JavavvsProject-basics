package interfaces;

interface M 
{
	int a=10;
	void display();
	
}

interface N 
{
	int b=20;
	void show();
}


public class MultipleInheritanceExample implements M,N

{
	public void display() 
	{
		System.out.println(a);
	}
	
	public void show() 
	{
		System.out.println(b);
	}

	public static void main(String[] args) 
	{
		MultipleInheritanceExample mi=new MultipleInheritanceExample();
		mi.display();
		mi.show();

	}

}
