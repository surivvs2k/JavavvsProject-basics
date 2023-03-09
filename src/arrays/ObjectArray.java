package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		/*
		Object a[] = new Object[5]; //limited elements we can store here
		
		a[0]=10; // integer
		a[1]=20.56; // double
		a[2]="Welcome"; // String
		a[3]='G'; // char
		a[4]=true; //boolean
		*/
		
		Object a[] = {100,250.333,"Welcome",'A',400,666.66}; // we can store here any number of elements
		
		for(Object i:a) {
			
			System.out.println(i);
		}
				

	}

}
