package assignments;

import java.util.Date;

//WAP to display system time and date. Store day,date,month year values in String
public class Assignment_71
{

	public static void main(String[] args)
	{
		Date d1 =new Date();
		
		System.out.println(d1.getTime());
		
	String s1 = d1.toString();
		
	System.out.println(s1);
	
	System.out.println(s1.substring(0,3));  // day
	
	System.out.println(s1.substring(8,10));  // date
	
	System.out.println(s1.substring(4,7));  // month
	
	System.out.println(s1.substring(24,28));  // year
	
	}

}
