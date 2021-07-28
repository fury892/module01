
public class Program {
	public static void main (String [] args)
	{
		long a = 1, b = 1;
		for (int i = 1; i <= 200; i++)
		{
			a = i * i;
			b = a * a;
			System.out.print(b + " ");
		}
	}
}
