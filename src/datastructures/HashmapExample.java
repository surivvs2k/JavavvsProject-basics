package datastructures;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		
		//Adding keypairs into hash map
		hm.put(101, "Suri");
		hm.put(102, "Mini");
		hm.put(103, "Yami");
		
		System.out.println(hm);
		
		for (Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "  "+m.getValue());
		}
		

	}

}
