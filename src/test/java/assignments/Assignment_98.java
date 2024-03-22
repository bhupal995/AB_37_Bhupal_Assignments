package assignments;

import java.util.Collections;
import java.util.LinkedList;

// WAP on LinkedList
public class Assignment_98 {

	public static void main(String[] args) {
		
		LinkedList L1 = new LinkedList();
		L1.add("Testing");
		L1.add("Manual");
		L1.add("");
		L1.add("Testing");
		L1.add("Automation");
		
//		L1.add(null);
		
		System.out.println("Before sorting  +  "+L1);
		Collections.sort(L1);
		
		System.out.println("After sorting +  "+L1);

	}

}
