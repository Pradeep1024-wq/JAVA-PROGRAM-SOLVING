import java.util.Scanner;

public class ReverseANumber 
{
	public void UseStringBuilder() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int num = sc.nextInt();
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.print("THE REVERSE OF THE NUMBER :"+ rev);
	}
	public static void main(String[] args) 
	{
		ReverseANumber obj = new ReverseANumber();
		obj.UseStringBuilder();
	}
}
