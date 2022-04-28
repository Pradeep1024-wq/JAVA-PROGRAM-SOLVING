import java.util.Scanner;  //must include for user input

public class input 
{ 
	public void sum()
	{
		Scanner sc = new Scanner(System.in);  //create a scanner 
		System.out.println("ENTER THE FIRST INTEGER :");   
		int a=sc.nextInt();  //store the value in a
		System.out.println("ENTER THE SECOND INTEGER :");
		int b=sc.nextInt();  //store the value in b
		int c = a+b;
		System.out.println("THE ADDITION OF TWO INTEGERS :"+c);
	}
		
	public static void main(String[] args) 
	{
		input obj = new input();   // object
		obj.sum();
	}
}
