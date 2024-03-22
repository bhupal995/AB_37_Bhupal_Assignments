package assignments;
//Create an array of length 4 of int data type and 
//find out average of those numbers and remainder of those
public class Assignment_66
{
	public static void main(String[] args)
	{
		int lent[]=new int[4];	
		lent[0]=4;
		lent[1]=5;
		lent[2]=6;
		lent[3]=7;
		
		int sum=0;
		for(int i =0;i<lent.length;i++)
		{
			sum=sum+lent[i];
		}
		System.out.println(sum);
		
		double avg =sum/lent.length;
		System.out.println("Average is "+avg);
		double rem = sum%lent.length;
		System.out.println("Reminder is "+rem);
		
	}

}
