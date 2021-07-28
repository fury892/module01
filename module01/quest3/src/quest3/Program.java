package quest3;

public class Program 
{
	public static void main(String [] args)
	{
		double x = 2, y = 3;
		double z = ((Math.sin(x) + Math.cos(y)) / Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println(z);
	}
}
