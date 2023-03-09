package arrays;

public class Arrayexample3 {

	public static void main(String[] args) {
		
		String s[] = new String[3];
		
		s[0]="Welcome";
		s[1]="to";
		s[2]="Tirupati";
		
		System.out.println(s.length);
		
		for (String i:s) {
			
			System.out.println(i);
		}

	}

}

/*
Output
3
Welcome
to
Tirupati

*/
