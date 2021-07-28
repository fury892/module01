package quest7;
import java.util.Scanner;

public class Program {
public static void main (String [] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Введите 1 угол: ");
	double angel1 = in.nextDouble();
	System.out.println("Введите 2 угол:");
	double angel2 = in.nextDouble();
	if (angel1 == 90 || angel2 == 90)
	{
		System.out.println("Треугольник прямоугольный.");
	}
	else
		System.out.println("Треугольник не прямоугольный");
	}
}
