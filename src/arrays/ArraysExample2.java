package arrays;

public class ArraysExample2 {

	public static void main(String[] args) {
		
		int a[] = {100,200,300,400,500};
		
		int sum=0;
		
		
		for(int i:a) {
			
			System.out.println(i); // 100,200,300,400,500
			
			sum=sum+i; //100,300,600,1000,1500 (summary)
		}
		
		System.out.println("****************************");
		System.out.println(sum); //(100+200+300+400+500=1500)		

	}

}


/*
Output

100
200
300
400
500
****************************
1500

*/
