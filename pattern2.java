package assignment;

public class pattern2 
{
	/* A
	 * A B
	 * A B C
	 */

	public static void main(String[] args) 
	{
		for(int i=1;i<=3;i++)
		{
			int k=65;
			for(int j=1;j<=i;j++)
			{					
				System.out.print((char)k + " ");
				k++;
			}
			System.out.println();
		}
	}
}
