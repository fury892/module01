import java.util.Scanner;

public class Program {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		for (int i = m; i <= n; i++)
		{
			System.out.print(i + ": ");
			for (int j = 2; j <= n - 1; j++)
			{
				if (i % j == 0 )
				{
					if (i % j == j)
					{
						System.out.print("0");
					}
					System.out.print(j + " ");
				}
			}
			System.out.println();
			m++;
		}
	}
}
