package arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String s = "Welcome";
		
		System.out.println(s.length()); // Number of characters 7
		
		//Concatenation
		System.out.println("********Concatenation**********");

		
		String s1 = "Welcome to";
		String s2 = " Training";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		//Equals
		System.out.println("********Equals**********");
		
		String s3 = "WELCOME";
		String s4 = "welcome";
		
		System.out.println(s3.equals(s4)); //false
		
		//EqualsIgnoreCase
		System.out.println("********EqualsIgnoreCase**********");

		System.out.println(s3.equalsIgnoreCase(s4)); //true

		//contains()
		System.out.println("********contains**********");

		//s3.contains("WEL"); //true
		//s3.contains("xyz"); //false
		
		System.out.println(s3.contains("WEL")); //true
		System.out.println(s3.contains("xyz")); //false
		
		//substring

		System.out.println("********substring**********");
		
		System.out.println(s.substring(0,3));
		System.out.println(s.substring(2,5));
		System.out.println(s.substring(4,7));



	}

}


/*
Output

Welcome to Training
********Equals**********
false
********EqualsIgnoreCase**********
true
********contains**********
true
false
********substring**********
Wel
lco
ome

*/
