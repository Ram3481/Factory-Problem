/**
 * 
 */
package EmpEarning;

import java.util.Scanner;



public class Job_Staart {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of job");
		int size = sc.nextInt()	;
		int [][] job = new int[size][3];
		{
		System.out.println("Enter the Start time, ending time, earning");
		
		}
		for(int i=0; i<job.length; i++)
		{
			for(int j=0; j<job[0].length; j++)
			{
				job[i][j]=sc.nextInt();
			}
		}
		int result[]=calculate(job);
		for(int i:result)
		{ 
			System.out.println(i);
		}

	}
	public static int[] calculate(int[][] job)
	{
		int max = job[0][2];
		int sum = 0;
		for(int i=0; i<job.length; i++)
		{
			sum+=job[i][2];
			if(max<job[i][2])
				max= job[i][2];
		
		}
		int[] result= new int[2];
		result[0]=job.length-1;
		result[1]=sum-max;
		return result; 
	}

}
