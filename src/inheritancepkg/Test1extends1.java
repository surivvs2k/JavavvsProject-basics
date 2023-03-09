package inheritancepkg;



class K 
{
	int a;
	int b;
	
	public void display() 
	{
		System.out.println(a+b);
	}
	
}

class L extends K
{
	int p;
	int q;
	
	public void show() 
	{
		System.out.println(p+q);
	}
	
}

class M extends L
{
	int x;
	int y;
	
	public void addition() 
	{
		System.out.println(x+y);
	}
	
}

public class Test1extends1 {

	public static void main(String[] args) {
		
		System.out.println("output of class K");
		K kobj=new K();
		kobj.a=100;
		kobj.b=200;
		kobj.display();
		
		System.out.println("output of class L");
		L lobj=new L();
		lobj.p=101;
		lobj.q=202;
		lobj.show();
		System.out.println("output accessing class K variable using extends");
		lobj.a=150;
		lobj.b=250;
		lobj.display();
		
		System.out.println("output of class M");
		M mobj=new M();
		mobj.x=111;
		mobj.y=222;
		mobj.addition();
		System.out.println("output accessing class L variable using extends");
		mobj.a=151;
		mobj.b=253;
		mobj.p=122;
		mobj.q=322;
		mobj.display();
		mobj.show();
		

	
		
	}

}
