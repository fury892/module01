package quest7;
import java.util.Scanner;

public class Program {
public static void main (String [] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("������� 1 ����: ");
	double angel1 = in.nextDouble();
	System.out.println("������� 2 ����:");
	double angel2 = in.nextDouble();
	if (angel1 == 90 || angel2 == 90)
	{
		System.out.println("����������� �������������.");
	}
	else
		System.out.println("����������� �� �������������");
	}
}
