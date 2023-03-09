package conditionalstatements;

public class Swapping {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Value of a is before swapping :" + a);
		System.out.println("Value of b is before swapping :" + b);
		
		int c;
		c=a;
		a=b;
		b=c;
		
		System.out.println("Value of a is after swapping :" + a);
		System.out.println("Value of b is after swapping :" + b);
		System.out.println("Value of c is after swapping :" + c);




	}

}

/*
Output:
Value of a is before swapping :10
Value of b is before swapping :20
Value of a is after swapping :20
Value of b is after swapping :10
Value of c is after swapping :10

*/
