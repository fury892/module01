package quest4;

public class Program 
{
	public static void main (String [] args)
	{
		double x = 111.222;
		System.out.println(x);
		double z = (x * 1000) % 1000 + (int) x / 1000.0;
		System.out.println(z);
	}
}
