import java.util.Scanner;

public class basic 
{ 
	public void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST INTEGER :");
		int a=sc.nextInt();
		System.out.println("ENTER THE SECOND INTEGER :");
		int b=sc.nextInt();
		int c = a+b;
		System.out.println("THE ADDITION OF TWO INTEGERS :"+c);
	}
		
	public static void main(String[] args) 
	{
		basic obj = new basic();   // object
		obj.sum();
	}
}
