package interfaces;


class A 
{
	int a=10;
	int b=20;
	
	void display() {
	System.out.println(a+b);
	}

}

final class B extends A
{
	int x=11;
	int y=22;
	
	void show() {
	System.out.println(x+y);
	}

}
public class FinalExample {

	public static void main(String[] args) 
	{
		A aobj=new A();
		aobj.a=20;
		aobj.display();
		
		B bobj=new B();
		bobj.x=33;
		bobj.y=44;
		bobj.show();
		
		bobj.a=55;
		bobj.b=33;
		bobj.display();

		
	}

}

/*
Output:
40
77
88
*/
