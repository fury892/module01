import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		if (x <= 3)
		{
			double y = (Math.pow(x, 2) - 3 * x + 9);
			System.out.printf("Ответ: %.2f", y);
		}
		if (x > 3)
		{
			double y = (x / (Math.pow(x,  3) + 6));
			System.out.printf("Ответ: %.3f", y);
		}
	}
}
