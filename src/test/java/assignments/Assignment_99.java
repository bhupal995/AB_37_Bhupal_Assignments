	package assignments;

import java.util.ArrayList;
import java.util.Collections;

// WAP on ArrayList
public class Assignment_99 {

	public static void main(String[] args) {
		
		ArrayList A99 = new ArrayList();
		
		A99.add("Testing");
		A99.add("Manual");
		A99.add("");
		A99.add("Testing");
		A99.add("Automation");
	//	A99.add(null);
		System.out.println("Before sorting : "+A99);
		Collections.sort(A99);
		System.out.println("After sorting : "+A99);
		
	}

}
