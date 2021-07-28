
public class Program {
	public static void main (String[] args)
	{
		int a = 0;
		int b = 0;
		for(int i = 1; i < 101; i++)
		{
			a = i * i;
			b = b + a;
		}
		System.out.print(b);
	}
}
