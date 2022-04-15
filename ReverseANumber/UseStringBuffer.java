import java.util.Scanner;

public class ReverseANumber 
{
	public void UseStringBuffer() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER :");
		int num = sc.nextInt();
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.print("THE REVERSE OF THE NUMBER :"+ rev);
	}
	public static void main(String[] args) 
	{
		ReverseANumber obj = new ReverseANumber();
		obj.UseStringBuffer();
	}
}
