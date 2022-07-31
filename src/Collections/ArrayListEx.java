package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();// restricting the data type to be string , list1 is the obj of Arraylist
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // for integer
		ArrayList<Float> list3 = new ArrayList<Float>(); // for Float
		
		
		list1.add("Devi");//function to add the data -in built
		list1.add("Mehta");
		list1.add("Shanti");
		list1.add("Priyanka");
		list1.add("Ramesh");
		
		System.out.println("The list is " +list1);
		System.out.println("The isze is " +list1.size());
		list1.remove(1); // function to remove the data - in built
		System.out.println("The list is " +list1);
		System.out.println("The isze is " +list1.size());
		
		System.out.println("Data @ 4th postion is " +list1.get(3));
		list1.set(1, "Kumari");  // To replace
		System.out.println("now the updated name is " +list1);
		
		list1.add(2, "Shanti");
		System.out.println("now the updated name is " +list1);
		
		Collections.sort(list1);
		System.out.println("now the updated name is " +list1);
		
		for(int index=0;index<list1.size();index++) {
			if(list1.get(index).equals("Priyanka")){
	            System.out.println(index);
	            break;
			}
		}
		for(String lst : list1) {
			System.out.println(lst);
		}
		Collections.sort(list1,Collections.reverseOrder());
	}

}
