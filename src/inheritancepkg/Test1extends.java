package inheritancepkg;


class E 
{
	int a;
	int b;
	
	public void display() 
	{
		System.out.println(a+b);
	}
	
}

class F extends E // we can access E variables
{
	int x;
	int y;
	
	public void show() 
	{
		System.out.println(x+y);

	}
}


public class Test1extends {
	
public static void main(String[] args) {
		
		System.out.println("output of class E");

		E eobj=new E();
		eobj.a=100;
		eobj.b=200;
		eobj.display();
		
		System.out.println("output of class F");
		F fobj=new F();
		fobj.x=111;
		fobj.y=222;
		fobj.show();
		
		System.out.println("output of class E using after extends at class F");
		
		fobj.a=444;
		fobj.b=556;
		fobj.display();
		

	}
}
