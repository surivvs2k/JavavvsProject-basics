package conditionalstatements;

public class LargestOfThreenumbers {

	public static void main(String[] args) 
	
	{
		
		int a = 10;
		int b = 100;
		int c = 30;
		
		
		if ((a>b) && (a>c)) 
		{
			System.out.println("a is largest");
			

		} else if ((b>c) && (b>a)) 
		{
			System.out.println("b is largest");
			

		} else 
		{
			System.out.println("c is largest");
			

		}

	}

}
