package Activity9;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Mango");
		myList.add(1,"Watermelon");
		myList.add(0,"Banana");
		
		for(String s:myList)
		{
			System.out.println(s);
		}
		
		System.out.println("3rd fruit name is " + myList.get(2));
		
		if(myList.contains("Mango"))
		{
			System.out.println("Mango Exists");			
		}
		else
		{
			System.out.println("Mango Not Exists");
		}
		
		System.out.println("Size of array is " + myList.size());
		myList.remove("Banana");
		
		System.out.println("New Size of array is " + myList.size());	
	}

}
