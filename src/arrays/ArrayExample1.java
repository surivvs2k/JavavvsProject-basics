package arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		//store elements into array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[3]);
		
		//read elements from an array
		for (int i=0;i<=4;i++) 
		{
			System.out.println("a in array values:  " +a[i]);
		}
		
		
		System.out.println("***********************");
		//for.......each
		
		int b[] = new int[5];
		
		//store elements into array
		b[0] = 110;
		b[1] = 120;
		b[2] = 130;
		b[3] = 140;
		b[4] = 150;
		
		for (int i:b) 
		{
			System.out.println("b in array values:  " +i);
		}

	}

}


/*
Output

a in array values:  40
a in array values:  50
***********************
b in array values:  110
b in array values:  120
b in array values:  130
b in array values:  140
b in array values:  150

*/
