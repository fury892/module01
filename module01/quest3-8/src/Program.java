import java.util.Scanner;
import java.util.ArrayList;

public class Program {
	public static void main (String [] args)
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }
    public static ArrayList numberEnter(int a){
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(a > 0){
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
}
