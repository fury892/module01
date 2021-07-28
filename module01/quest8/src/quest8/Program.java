package quest8;
import java.util.Scanner;

public class Program {

	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите 4 числа: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
	}
}
