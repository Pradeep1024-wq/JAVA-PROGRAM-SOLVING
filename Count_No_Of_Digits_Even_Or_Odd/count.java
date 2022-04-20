import java.util.Scanner;

public class Count_No_Of_Digits_Even_Or_Odd 
{
	public void count()
	{
		System.out.println("ENTER THE NUMBER:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		if(count%2==0)
		{
			System.out.println("THE NUMBER OF DIGITS :"+count +" IT HAVE EVEN NO OF DIGITS");
		}
		else
		{
			System.out.println("THE NUMBER OF DIGITS :"+count +" IT HAVE ODD NO OF DIGITS");
		}
	}
	public static void main(String[] args) 
	{
		Count_No_Of_Digits_Even_Or_Odd obj = new Count_No_Of_Digits_Even_Or_Odd();
		obj.count();
	}
}
