package conditionalstatements;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		
		int day=7;
		
		switch(day) 
		{
		case 1: System.out.println("Sudnay");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		default: System.out.println("Saturday");break;

		}

	}

}

/*
Output:
Saturday
*/
