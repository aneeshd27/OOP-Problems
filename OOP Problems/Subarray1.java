import java.util.*;
public class Sumsubarray1 
{
	public static void main(String args[])
	{
		int a[]= {1, 4, 20, 3, 10, 5};
		int i,sum,j;
		sum=0;
		int t=33;
		for(i=0;i<6;i++)
		{
			for(j=i;j<6;j++)
			{
				sum+=a[j];
				if(sum==t)
				{
					System.out.println(i+" "+j);
				}
			}
			sum=0;
		}
	}

}
