package Activity11;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Green");
		hm.put(2, "Yellow");
		hm.put(3, "Orange");
		hm.put(4, "Blue");
		hm.put(5, "Red");
		
		System.out.println("Original HashMap is " + hm);
		
		hm.remove(3);
		
		System.out.println("After removing orange" + hm);
		
		if(hm.containsValue("Green"))
			System.out.println("Green exists");
		else
			System.out.println("Green doesnot exist");
			
		
		System.out.println("HashMap size is " + hm.size());
	}

}
