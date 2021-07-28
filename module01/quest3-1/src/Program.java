import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = 0;
		for (int i = 0; i < a; i++)
		{
			b = b + i;
		}
		System.out.println(b);
	}
}
