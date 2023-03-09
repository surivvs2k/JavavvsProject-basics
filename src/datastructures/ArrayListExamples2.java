package datastructures;

import java.util.ArrayList;

public class ArrayListExamples2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println("Number of elements :" +al.size()); //Number of elements in a1
		
		al.add("Welcome");
		al.add(10);
		al.add(10.323);
		al.add('C');
		
		System.out.println("Number of elements in array list after adding :" +al.size()); //Number of elements in a1
		System.out.println("Elements in array list :" +al);
		
		//After inserting elements into array list
		al.add(2,"Training");
		System.out.println("Number of elements in array list after inserting :" +al.size()); //Number of elements in a1
		System.out.println("Elements in array list :" +al);
		
		al.add(4,1234);
		System.out.println("Number of elements in array list after inserting :" +al.size()); //Number of elements in a1
		System.out.println("Elements in array list :" +al);
		
		
		//Removing elements from array list
		
		al.remove("Welcome");
		System.out.println("Elements in array list :" +al);
		
		al.remove(1);
		System.out.println("Elements in array list :" +al);

		
		al.add(1,"Training");
		System.out.println("Elements in array list :" +al);


	}

}


/*
Output:
Elements in array list :[Welcome, 10, 10.323, C]
Number of elements in array list after inserting :5
Elements in array list :[Welcome, 10, Training, 10.323, C]
Number of elements in array list after inserting :6
Elements in array list :[Welcome, 10, Training, 10.323, 1234, C]
Elements in array list :[10, Training, 10.323, 1234, C]
Elements in array list :[10, 10.323, 1234, C]
Elements in array list :[10, Training, 10.323, 1234, C]

*/
