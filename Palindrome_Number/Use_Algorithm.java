import java.util.Scanner;
public class Palindrome_Number 
{	
	public void Use_Algorithm()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER :");
		int n = sc.nextInt();
		int p = n;	
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		if(p==rev)
		{
			System.out.println("THE NUMBER IS PALINDROME :"+rev);
		}
		else
		{
			System.out.println(p+" THIS NUMBER IS NOT PALINDROME");
		}
	}
	public static void main(String[] args) 
	{
		Palindrome_Number obj = new Palindrome_Number();
		obj.Use_Algorithm();
	}
}
