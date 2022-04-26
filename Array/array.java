import java.util.Scanner;

public class array
{ 
	public void callarray()
	{
		int n = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY:");
		n=sc.nextInt();
		int a [] = new int[n];
		System.out.println("ENTER THE ARRAY ELEMENTS:");
		for(int i=0;i<n;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println("ARRAY ELEMENTS ARE:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) 
	{
		array obj = new array();
		obj.callarray();
	}
}
