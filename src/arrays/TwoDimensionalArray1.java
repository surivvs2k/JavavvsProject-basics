package arrays;

public class TwoDimensionalArray1 {

	public static void main(String[] args) {
		
		int a[][] = { {10,15,20}, {30,35,40},{50,55,60}, {70,75,80}, {90,95,100} };
		
		for (int i[]:a) 
		{
			
			for (int j:i) 
			{
				
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}
		
	}

}

/*10  15  20  
30  35  40  
50  55  60  
70  75  80  
90  95  100  
*/
