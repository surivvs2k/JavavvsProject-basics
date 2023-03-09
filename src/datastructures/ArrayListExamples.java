package datastructures;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		
		ArrayList <String> list = new ArrayList<String>();
		
		//adding elements to arra list
		
		list.add("Suri");
		list.add("Suriv");
		list.add("Surivv");
		list.add("Surivvs");
		list.add("Surivvss");
		
		System.out.println(list.size()); //5
		System.out.println(list);    //Suri, Suriv, Surivv, Surivvs, Surivvss
		System.out.println(list.get(0));//Suri
		
		for (String s:list)//reading elements from arraylist
		{
			System.out.println(s);
		}

	}

}


/*
Output:
5
[Suri, Suriv, Surivv, Surivvs, Surivvss]
Suri
Suri
Suriv
Surivv
Surivvs
Surivvss

*/
