import java.util.Scanner;
class Problem_3
{
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.print("a : ");
			n=sc.nextInt();
			int m=1;
			for(int i=1;i<n+1;i++)
			{
				if(n%2==0)
				{
					if(i%2==0 && i==n)
						continue;
					else
					{
						System.out.print(m+" ");
						m+=2;
					}
				}
				else
				{
					System.out.print(m+" ");
					m+=2;
				}
			}
			System.out.println();
		}while(n!=-1);
	}
}
		