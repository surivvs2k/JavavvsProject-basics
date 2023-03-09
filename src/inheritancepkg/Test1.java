package inheritancepkg;


class A 
{
	int a;
	int b;
	
	public void display() 
	{
		System.out.println(a+b);
	}
	
}

class B 
{
	int x;
	int y;
	
	public void show() 
	{
		System.out.println(x+y);

	}
}


public class Test1 {

	public static void main(String[] args) {
		
		System.out.println("output of class A");

		A aobj=new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();
		
		System.out.println("output of class B");
		B bobj=new B();
		bobj.x=111;
		bobj.y=222;
		bobj.show();
		

	}

}


/*
Output:
output of class A
300
output of class B
333
*/
