import java.util.Scanner;

public class Program {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		double a = 1, b = 4;
		System.out.print("¬ведите шаг : ");
		double h = in.nextDouble();
		for (a = 1; a < b; a = a + h)
		{
			if (a > 2)
			{
				System.out.print(a + " ");
			}
			if (a <= 2)
			{
				System.out.print(-a + " ");
			}
		}
	}
}
