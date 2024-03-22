package assignments;
//Create an array of length 5. Find out the index of number 41
public class Assignment_76
{

	public static void main(String[] args)
	{
		int[] num = {10,42,44,43,41};
	
	int numcheck = 41;
	
	for(int i=0;i<num.length;i++)
	{
		if(numcheck==num[i])
		{
			System.out.println("Number present at array: "+i);
		}
	}

		
		
		
	}

}
