import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.print("¬ведите число е - ");
		int e = in.nextInt();
		double c = 0;
		for (int i = 1; i < 10; i++)
		{
			if (i >= e)
			{
				c = (1 / Math.pow(2, i) + (1 / Math.pow(3, i)));
			}
		}
		System.out.println(c);
	}
}
