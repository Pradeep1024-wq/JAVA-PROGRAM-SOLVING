import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE A VALUE :");
		int a = sc.nextInt();
		System.out.println("ENTER THE B VALUE :");
		int b = sc.nextInt();
		int c = a-b;
		System.out.println("SUBTRACTION OF TWO VARIABLE :"+c);
	}
}
