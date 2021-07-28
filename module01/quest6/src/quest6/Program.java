package quest6;
import java.util.Scanner;

public class Program {
public static void main (String [] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("¬ведите координаты х и у - ");
	double x = in.nextInt();
	double y = in.nextInt();
	if ((x < 2.1 && x > -2.1) && (y < 2.1 && y > -1.6))
	{
		System.out.println("true");
	}
	else
		System.out.println("false");
}
}
