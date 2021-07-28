import java.util.Scanner;

public class Prorgram {
	public static void main (String [] args)
	{
		int a = 5, b = 6;
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		if ((x <= a && y <= b) || (y <= a && y <= b) ||
				x <= a && z <= b || z <= a && x <= b ||
				y <= a && z <= b || z <= a && y <= b)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
