import java.util.Scanner;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� ������ �����: ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("������� ���������� ������ �����: ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		System.out.println("������� ���������� ������� �����: ");
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		if ((x1 == x2 && x1 == x3) || (y1 == y2 && y1 == y3))
			System.out.println("true");
		else 
			System.out.println("false");
		}
}
