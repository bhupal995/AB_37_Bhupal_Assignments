package assignments;

import java.util.Collections;
import java.util.Vector;

// WAP on Vector
public class Assignment_100
{

	public static void main(String[] args)
	{
		Vector v1 =new Vector();
		
		v1.add("reddy");
		v1.add("reddy");
		v1.add("");
		v1.add("Testing");
		v1.add("Automation");
//		v1.add(null);					// it can store null but during sorting getting error
		System.out.println("Before sorting : "+v1);
		Collections.sort(v1);
		System.out.println("After sorting : "+v1);
		

	}

}
