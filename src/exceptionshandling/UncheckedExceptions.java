package exceptionshandling;

public class UncheckedExceptions {
	
		public static void main(String[] args) {
			
			int a=20;
			//System.out.println(a/0);//ArithmeticException
			
			String s=null;
			//System.out.println(s.length()); //NullpointerException
			
			String st="12345";
			int i=Integer.parseInt(st);
			//System.out.println(i); //Output 12345
			
			String ss="abcdf";
			//int ii=Integer.parseInt(ss);
			//System.out.println(ii);  //NumberFormatException
			
			int arr[] = new int[5];
			arr[10] = 100;  //ArrayIndexOutOfBoundsException
		

	}

}
