import java.util.Scanner;

public class ReverseANumber 
{
	public void ReverseANumberUseAlgorithm() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num =num/10;
		}
		System.out.println("THE REVERSE OF THE NUMBER :"+rev);
	}
	public static void main(String[] args) 
	{
		ReverseANumber obj = new ReverseANumber();
		obj.ReverseANumberUseAlgorithm();
	}
}
