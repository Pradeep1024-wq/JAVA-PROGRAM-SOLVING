import java.util.Scanner;

public class Count_No_Of_Digits 
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
		System.out.println("THE NUMBER OF DIGITS :"+count);
	}
	public static void main(String[] args) 
	{
		Count_No_Of_Digits obj = new Count_No_Of_Digits();
		obj.count();
	}
}
