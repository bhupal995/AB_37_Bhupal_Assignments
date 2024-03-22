package assignments;
//Create an array of length 4 of int data type. Find out 41 is present or not in array. 
//Print message in both the cases.
public class Assignment_75
{

	public static void main(String[] args)
	{
		int num[] = {41,22,35,43};
		
		int nocheck = 41;
	
		for(int i=0; i<num.length;i++)
		{	
			if(nocheck==num[i])
			{
				System.out.println("41 is present");
			}
			else
			{
				System.out.println("not present");
			}	
		}
		
	}


}
