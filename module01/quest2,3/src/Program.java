import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите координаты первой точки: ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("¬ведите координаты второй точки: ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		System.out.println("¬ведите координаты третьей точки: ");
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3))
			System.out.println("true");
		else 
			System.out.println("false");
		}
}
