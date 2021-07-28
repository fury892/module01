package quest5;
import java.util.Scanner;

public class Program {

	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		System.out.println(t / 3600 + ":" + t / 60 % 60 + ":" + t % 60);
	}
}
